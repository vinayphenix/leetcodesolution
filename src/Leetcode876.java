public class Leetcode876 {
    public ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null) {
            fast=fast.next;
            if(fast!=null){
                fast=fast.next;
            }else {
                break;
            }
            slow=slow.next;
        }
        return slow;
    }

     class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
