public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean haveCycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                haveCycle = true;
                break;
            }
        }
        ListNode temp = head;
        if (haveCycle) {
            while (temp != slow) {
                temp = temp.next;
                slow = slow.next;
            }
            return temp;
        }
        return null;
    }
}