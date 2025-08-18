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
        if (haveCycle) {
            ListNode temp = head;
            while (temp != slow) {
                slow = slow.next;
                temp = temp.next;
            }
            return temp;
        }
        return null;
    }
}