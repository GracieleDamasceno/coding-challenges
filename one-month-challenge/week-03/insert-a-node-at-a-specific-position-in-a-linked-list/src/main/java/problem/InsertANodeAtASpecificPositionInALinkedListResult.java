package problem;

public class InsertANodeAtASpecificPositionInALinkedListResult {

    /*
     * Complete the 'insertNodeAtPosition' function below.
     *
     * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
     * The function accepts following parameters:
     *  1. INTEGER_SINGLY_LINKED_LIST llist
     *  2. INTEGER data
     *  3. INTEGER position
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

    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
        // Write your code here
        SinglyLinkedListNode singlyLinkedListNode = new SinglyLinkedListNode(data);
        SinglyLinkedListNode temporary = llist;

        if(llist == null){
            llist = singlyLinkedListNode;
            singlyLinkedListNode.next = null;
            return llist;
        }
        if(position == 0){
            singlyLinkedListNode.next = llist.next;
            singlyLinkedListNode = llist;
            return llist;
        } else {
            for (int i = 0; i < (position - 1); i++) {
                temporary = temporary.next;
            }
            singlyLinkedListNode.next = temporary.next;
            temporary.next = singlyLinkedListNode;
            return llist;
            }
        }
    }