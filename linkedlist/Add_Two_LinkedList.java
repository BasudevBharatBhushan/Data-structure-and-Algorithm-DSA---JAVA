package linkedlist;

public class Add_Two_LinkedList {

	public static void main(String[] args) {

		/*Addition from Left Side */
		
//		ListNode l1 = ListNode.addList(new int[] {2, 4, 3});
//		ListNode l2 = ListNode.addList(new int[] {5,6,4,9});
		
		ListNode l1 = ListNode.addList(new int[] {9,9,9,9,9,9,9});
		ListNode l2 = ListNode.addList(new int[] {9,9,9,9});
		
		ListNode res = addTwoNumbers(l1, l2);
		
		ListNode.print(res);
		
		
	}
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		
		ListNode temp = null, res = null;
		int carry = 0;
		
		while(l1 != null && l2!= null) {
			
			int sum = l1.val + l2.val + carry;
			int unit = sum%10;
			
			carry = sum/10;
			
			ListNode toAdd = new ListNode(unit);
			
			if(ListNode.isEmpty(temp)) {
				temp = toAdd;
				res = temp;
			}else {
				temp.next = toAdd;
				temp = temp.next;
			}
			l1 = l1.next;
			l2 = l2.next;
		}
		
		if(l1!= null) {
			while(l1!=null) {
				int sum = l1.val + carry;
				int unit = sum%10;
				
				carry = sum/10;
				
				ListNode toAdd = new ListNode(unit);
				
				temp.next = toAdd;
				temp = temp.next;
				l1 = l1.next;
			}
			
			
		}else if(l2 != null) {
			while(l2!=null) {
				int sum = l2.val + carry;
				int unit = sum%10;
				
				carry = sum/10;
				
				ListNode toAdd = new ListNode(unit);
				
				temp.next = toAdd;
				temp = temp.next;
				l2 = l2.next;
			}
			
		}
		
		if(carry>0) {
			ListNode toAdd = new ListNode(carry);
			temp.next = toAdd;
		}
		
		return res;
		
	}

}
