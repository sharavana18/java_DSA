import java.util.*;
class Node {
	int data;
	Node next;
	Node prev;
	Node(int data) {
		this.data = data;
		this.next = null;
		this.prev = null;
	}
}
class Linkedlist {
	Node head = null;
	void insert(int data) {
		Node newnode = new Node(data);
		if(head == null) {
			head = newnode;
			return;
		}
		else {
			Node temp = head;
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next = newnode;
			newnode.prev = temp;
		}
	}
	void insertAtBeg(int data) {
		Node newnode = new Node(data);
		if(head == null) {
			head = newnode;
		}
		else {
			newnode.next = head;
			head.prev = newnode;
			head = newnode;
		}
	}
	void display() {
		if(head == null) {
			System.out.println(" List is Empty");
			return;
		}
		else {
			Node temp = head;
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp = temp.next;
			}
			System.out.println();
		}
	}
	void rotate(int k) {
		if(head == null || head.next == null || k==0) {
			return;
		}
		Node temp = head;
		int len = 1;
		while(temp.next!=null) {
			temp = temp.next;
			len ++;
		}
		Node tail = temp;
		k = k%len;
		if(k==0) {
			return;
		}
		temp = head;
		for(int i=1; i<len-k; i++) {
			temp = temp.next;
		}
		Node newhead = temp.next;
		temp.next = null;
		newhead.prev = null;
		tail.next = head;
		head.prev = tail;
		head = newhead;
	}
	void reverse(){
	    if(head == null || head.next == null){
	        return;
	    }
	Node curr = head;
    Node temp = null;
    while (curr!= null) {
        temp = curr.prev;
        curr.prev = curr.next;
        curr.next = temp;
        curr = curr.prev;
    }
    if (temp != null) {
        head = temp.prev;
    }
} boolean palindrom(){
    if(head == null || head.next == null)
    return true;
    Node right = head;
    Node left = head;
    while(right.next!=null){
        right = right.next;
    }
    while(left!=right){
        if(left.data!= right.data){
            return false;
        }
        left = left.next;
        right = right.prev;
    }
    return true;
}
void display1() {
	if(head == null) {
		System.out.println(" List is Empty");
		return;
	}
	else {
		Node temp = head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.prev;
		}
		System.out.println();
	}
}
}
public class doubly_palindrom {
	public static void main(String[] args) {
		Linkedlist ll = new Linkedlist();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			ll.insert(sc.nextInt());
		}
		ll.display();
		if(ll.palindrom()){
		    System.out.println("palindrom");
		}
		else
		System.out.println("non palindrom");
	}
}
