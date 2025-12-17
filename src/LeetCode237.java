public class LeetCode237 {

    public static void deleteNode(ListNode node) {

        ListNode prev = null;
        while (node.next != null) {

            prev = node;
            node.val = node.next.val;
            //            uncomment the below line when running the code
            //            node = node.next;
        }
        prev.next = null;
    }

    class ListNode {
        int val;
        Leetcode876.ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, Leetcode876.ListNode next) { this.val = val; this.next = next; }
    }
}
