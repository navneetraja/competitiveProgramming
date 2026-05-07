package LinkedList;

//Given the head of a singly linked list, reverse the list, and return the reversed list.
public class ReverseLinkList {

    public static void main(String [] args){
      ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        ListNode prev = null;
        ListNode next =  null;
        ListNode current = head;

        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
    }

}
