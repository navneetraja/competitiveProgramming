package LinkedList;

public class LinkedListCycle {

    public static void main(){
        ListNode list = new ListNode(1);
        boolean hasCycles = hasCycle(list);
    }

    public static boolean hasCycle(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }

        }
        return false;

    }
}
