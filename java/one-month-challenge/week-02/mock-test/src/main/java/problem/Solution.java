package problem;

import java.io.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'buildAccountHistory' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY csvLines as parameter.
     */

    public static List<String> buildAccountHistory(List<String> csvLines) {
        List<String> output = new ArrayList<>();
        List<CustomerHistory> allCustomerHistories = new ArrayList<>();

        for (String csvLine : csvLines) {
            CustomerHistory customerHistory = getCsvContent(csvLine);
            allCustomerHistories.add(customerHistory);
        }

        for (int i = 0; i < allCustomerHistories.size(); i++) {
            int finalI = i;
            List<CustomerHistory> customer = allCustomerHistories.stream()
                        .filter(e -> e.getCustomerAccountId().equals(allCustomerHistories.get(finalI).getCustomerAccountId()))
                .collect(Collectors.toList());

                purchasesVerifier(customer, output);

                allCustomerHistories.removeAll(customer);
        }
        return output;
    }

    private static void purchasesVerifier(List<CustomerHistory> customerHistory, List<String> output) {
        String firstRecord = customerHistory.get(0).toString(AccountHistory.NO_HISTORY);
        output.add(firstRecord);

        for (int i = 1; i < customerHistory.size(); i++) {
            if(customerHistory.get(i).getEventType() == Events.PURCHASE){
                LocalDate date = customerHistory.get(i).getDate();
                String recordOutput;

                final List<CustomerHistory> previousTransactions = customerHistory.stream()
                        .filter(e -> date.isAfter(e.getDate()))
                        .collect(toList());

                long fraudHistory = previousTransactions.stream().filter(e -> e.getEventType() == Events.FRAUD_REPORT)
                        .count();
                long goodHistory = previousTransactions.stream()
                        .filter(e -> e.getEventType() == Events.PURCHASE &&
                                ChronoUnit.DAYS.between(e.getDate(), date)> 90)
                        .count();
                long unconfirmedHistory = previousTransactions.stream()
                        .filter(e -> e.getEventType() == Events.PURCHASE)
                        .count();

                if(fraudHistory > 0){
                    recordOutput = customerHistory.get(i).toString(AccountHistory.FRAUD_HISTORY, fraudHistory);
                    output.add(recordOutput);
                }else if(goodHistory > 0){
                    recordOutput = customerHistory.get(i).toString(AccountHistory.GOOD_HISTORY, goodHistory);
                    output.add(recordOutput);
                }else if(unconfirmedHistory > 0){
                    recordOutput = customerHistory.get(i).toString(AccountHistory.UNCONFIRMED_HISTORY, unconfirmedHistory);
                    output.add(recordOutput);
                }
            }
        }
    }

    private static CustomerHistory getCsvContent(String csvLines){
        final List<String> csvContent = Arrays.asList(csvLines.split(","));
        LocalDate date = LocalDate.parse(csvContent.get(0));
        String customerAccountId = csvContent.get(1);
        Events event = Events.valueOf(csvContent.get(2));
        return new CustomerHistory(date, customerAccountId, event);
    }
}
enum AccountHistory{
    NO_HISTORY,
    FRAUD_HISTORY,
    GOOD_HISTORY,
    UNCONFIRMED_HISTORY
}

enum Events{
    PURCHASE,
    FRAUD_REPORT;
}

class CustomerHistory{
    private LocalDate date;
    private String customerAccountId;
    private Events eventType;
    private Integer relevantEvents;

    public CustomerHistory(LocalDate date, String customerAccountId, Events eventType) {
        this.date = date;
        this.customerAccountId = customerAccountId;
        this.eventType = eventType;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getCustomerAccountId() {
        return customerAccountId;
    }

    public void setCustomerAccountId(String customerAccountId) {
        this.customerAccountId = customerAccountId;
    }

    public Events getEventType() {
        return eventType;
    }

    public void setEventType(Events eventType) {
        this.eventType = eventType;
    }

    public Integer getRelevantEvents() {
        return relevantEvents;
    }

    public void setRelevantEvents(Integer relevantEvents) {
        this.relevantEvents = relevantEvents;
    }

    public String toString(AccountHistory history, long relevantEvents) {
        return date + "," + customerAccountId + "," + history + ":" + relevantEvents;
    }

    public String toString(AccountHistory history) {
        return date + "," + customerAccountId + "," + history;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        //int csvLinesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> csvLines = IntStream.range(0, 8).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .collect(toList());

        List<String> result = Result.buildAccountHistory(csvLines);

        bufferedWriter.write(
                result.stream()
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
