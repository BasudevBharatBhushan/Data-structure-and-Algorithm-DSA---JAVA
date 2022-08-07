package linkedlist;

public class MyLinkedList {
	
	Node head;
	
	void add(int data) {
		Node toAdd = new Node(data);
		
		if(isEmpty())head = toAdd;
		
		Node temp = head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next= toAdd;	
	}
	
	void set(int index , int data) {
		index();
		Node x = head;
		while(x!=null) {
			if(x.index == index) {
				x.info = data;
			}
			x = x.next;
		}
	}
	
	void index() {
		Node temp = head;
		int i = 0;
		while(temp!=null) {
			temp.index= i++;
			temp = temp.next;
		}
	}
	
	void remove(int index) {
		index();
		if(index ==0) {
			head = head.next;
		}else {
			Node temp = head;
			
			while(temp!=null) {
				if(temp.index == (index-1)) {
					temp.next = temp.next.next;
					index();
					return;
				}
				temp = temp.next;
			}
		}
		
	}
	
	int size() {
		Node temp = head;
		int count = 0;
		
		while(temp!=null) {
			temp= temp.next;
			count++;
		}
		return count;
	}
	
	boolean isEmpty() {
		return head ==null;
	}
	
	class Node{
		Node next;
		int info;
		int index;
		
		public Node(int info) {
			this.info = info;
			next = null;
			
		}
	}
}
