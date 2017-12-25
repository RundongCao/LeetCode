class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
}

public class reverse {
	public static ListNode reverseList(ListNode head) {
        ListNode nextnode = new ListNode(0);
        ListNode cur = head;
        ListNode prev = null;
        
        
        while(cur!=null){
            nextnode = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nextnode;
        }
        
        return prev;
    }
}
