package week1;
class ListNode {
	  int val;
	  ListNode next;
	  ListNode(int x) { val = x; }
}

public class LC206 {
	public ListNode reverseList(ListNode head) {
	       if(head==null || head.next ==null){
	           return head;
	       }
	        ListNode p = reverseList(head.next);
	        head.next.next = head;
	        head.next = null;
	        return p;
	    }

}
