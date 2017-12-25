
public class test {
	public static void main(String[] args){
		int[] input1 = new int[]{0,1,2};
		
		System.out.println("Hello,World");
		
		//int[] nums = new int[]{1,1,1};
		ListNode l1 = buildList(input1);
		
		ListNode result = reverse.reverseList(l1);
		
		while(result!=null){
			System.out.println(result.val + "->");
			result = result.next;
		}
		
	}
	private static ListNode buildList(int[] input){
		ListNode prev = new ListNode(0);
		ListNode head = prev;
		for(int i = 0; i < input.length; i++){
			ListNode newNode = new ListNode(input[i]);
			newNode.next = null;
			prev.next = newNode;
			prev = newNode;
		}
		return head.next;
	}
}
