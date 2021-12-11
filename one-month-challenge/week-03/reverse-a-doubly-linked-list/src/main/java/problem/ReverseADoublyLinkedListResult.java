package problem;

public class ReverseADoublyLinkedListResult {
    /*
     * Complete the 'reverse' function below.
     *
     * The function is expected to return an INTEGER_DOUBLY_LINKED_LIST.
     * The function accepts INTEGER_DOUBLY_LINKED_LIST llist as parameter.
     */

    /*
     * For your reference:
     *
     * DoublyLinkedListNode {
     *     int data;
     *     DoublyLinkedListNode next;
     *     DoublyLinkedListNode prev;
     * }
     *
     */

    public static DoublyLinkedListNode reverse(DoublyLinkedListNode llist) {
        // Write your code here
        DoublyLinkedListNode temporary = llist.next;
        llist.next = llist.prev;
        llist.prev = temporary;
        return temporary == null ? llist : reverse(temporary);
    }
}
