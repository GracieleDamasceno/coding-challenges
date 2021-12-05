package problem;

public class ReverseLinkedListResult {

    /*
     * Complete the 'reverse' function below.
     *
     * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
     * The function accepts INTEGER_SINGLY_LINKED_LIST llist as parameter.
     */

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */

    public static SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {
        // Write your code here
        SinglyLinkedListNode previous = null;
        SinglyLinkedListNode current = llist;

        while (current != null){
            SinglyLinkedListNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;

    }

}