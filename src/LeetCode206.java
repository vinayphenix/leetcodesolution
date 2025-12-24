public class LeetCode206 {

    public ListNode reverseList(ListNode head) {


        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode current = head;
        ListNode prev = null;
        ListNode next = null;
        while (current != null) {
            next = current;
            current = current.next;
            next.next = prev;
            prev = next;

        }

        return prev;

    }

    class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
