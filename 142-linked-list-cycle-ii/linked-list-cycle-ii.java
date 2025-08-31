public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean isCycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                isCycle = true;
                break;
            }
        }
        if (isCycle) {
            ListNode temp = head;
            while (temp != slow) {
                slow = slow.next;
                temp = temp.next;
            }
            return temp;
        } else {
            return null;
        }
    }
}