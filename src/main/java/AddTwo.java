public class AddTwo {
    private class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        int carry = 0;
        ListNode curl1 = l1;
        ListNode curl2 = l2;
        ListNode curr = dummyHead;

        while(curl1 != null || curl2 != null) {

            int x = (curl1 != null) ? curl1.val : 0;
            int y = (curl2 != null) ? curl2.val : 0;

            int sum = x + y + carry;
            curr.next = new ListNode(sum);
            carry = sum/10;
            curr = curr.next;

            if (curl1 != null) curl1 = curl1.next;
            if (curl2 != null) curl2 = curl2.next;
        }

        if(carry > 0) {
            curr.next = new ListNode(carry);
        }

        return dummyHead.next;
    }
}
