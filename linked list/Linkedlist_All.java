import java.util.*;
class Node {
	int data;
	Node next;
	Node(int val) {
		data=val;
		next=null;
	}
}
class Linkedlist {
	Node head = null;
	
	void insertAtbeg(int val) {
		Node newnode = new Node(val);
		newnode.next=head;
		head=newnode;
	}
	void insertAtend(int val) {
		Node newnode = new Node(val);
		if(head==null) {
			head = newnode;
		}
		else {
			Node temp = head;
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next = newnode;
		}
	}
	void deleteAtbeg() {
		if(head==null) {
			System.out.println("it is underflow");
			return;
		}
		head=head.next;
	}
	void deleteAtend() {
		if(head==null) {
			System.out.println("it is underflow");
			return;
		}
		else if(head.next==null) {
			head = null;
		}
		else {
			Node temp = head;
			while(temp.next.next!=null) {
				temp = temp.next;
			}
			temp.next=null;
		}
	}
	void display() {
		Node temp = head;
		if(temp==null) {
			System.out.println("it is empty");
			return;
		}
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
}
public class Linkedlist_All {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Linkedlist ll = new Linkedlist();
		int n = sc.nextInt();
		if(n==1) {
			ll.insertAtbeg(10);
			ll.insertAtbeg(20);
			ll.insertAtbeg(30);
			ll.insertAtbeg(40);
			ll.display();
			ll.deleteAtbeg();
			ll.display();
		}
		else {
			ll.insertAtend(10);
			ll.insertAtend(20);
			ll.insertAtend(30);
			ll.insertAtend(40);
			ll.display();
			ll.deleteAtend();
			ll.display();
		}
	}
}
