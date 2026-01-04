package LinkedList;

public class MiddleOfTheLinkedList {

    // Method to find the middle node using count-based approach
    public static ListNode findMiddle(ListNode head) {
        int length = 0;
        ListNode temp = head;

        // First pass: count the number of nodes
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        // Second pass: get to the (length / 2)th node
        int mid = length / 2;
        temp = head;
        for (int i = 0; i < mid; i++) {
            temp = temp.next;
        }

        return temp;
    }

    // Utility method to print a linked list from a given node
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating the linked list: 1 -> 2 -> 3 -> 4 -> 5 -> 6
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        //head.next.next.next.next.next = new ListNode(6);

        // Find and print the middle node
        ListNode middle = findMiddle(head);
        System.out.println("Middle node value: " + middle.val);
        // Output: 4
        printList(middle);
    }
}
