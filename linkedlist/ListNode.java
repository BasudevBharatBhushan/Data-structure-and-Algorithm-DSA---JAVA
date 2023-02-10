package linkedlist;
import java.util.LinkedList;
import linkedlist.MyLinkedList.Node;

/*
 * Leetcode Defined LinkedList
 * 
 */

public class ListNode{
	ListNode next;
	int val;
//	ListNode head;
	ListNode pointer;
	
	public ListNode() {};
	
	public ListNode(int val) {
		this.val = val;
		next = null;
	}
	
	public ListNode(int val , ListNode next) {
		this.val = val;
		this.next = next;
	}
		
	
	static ListNode addList(int arr[]) {
		ListNode node = new ListNode(arr[0]);
		
		for(int i = 1; i< arr.length; i++) {
			node.add(arr[i], node);
		}
		
		return node;
	}
	 
	static void add(int data , ListNode head) {
		ListNode toAdd = new ListNode(data);
		
		if(isEmpty(head))head = toAdd;
		else {
			ListNode temp = head;
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next= toAdd;	
		}
		
	}
	
	
		
	static int size(ListNode head) {
		ListNode temp = head;
		int count = 0;
			
		while(temp!=null) {
			temp= temp.next;
			count++;
		}
			return count;
	}
	
	static void print(ListNode node) {
		while(node != null) {
			System.out.print(node.val + " ");
			node = node.next;
		}
	}
		
	static boolean isEmpty(ListNode head) {
		return head ==null;
	}
}
	


