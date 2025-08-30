public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int a = 0;
        int b = 0;
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        while (temp1 != null) {
            a++;
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            b++;
            temp2 = temp2.next;
        }
        temp1 = headA;
        temp2 = headB;
        if (a > b) {
            for (int i = 0; i < a - b; i++) {
                temp1 = temp1.next;
            }
        } else {
            for (int i = 0; i < b - a; i++) {
                temp2 = temp2.next;
            }
        }
        while (temp1 != temp2) {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        if (temp1 != temp2) {
            return null;
        }
        return temp1;
    }
}