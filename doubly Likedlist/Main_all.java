import java.util.*;
class Node{
    int data;
    Node next;
    Node prev;
    Node (int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
class Linkedlist{
    Node head = null;
    void insert(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }
        else if(head.next==null){
            head.next = newnode;
            newnode.prev = head;
        }
        else{
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }temp.next = newnode;
            newnode.prev = temp;
        }
    }
    void insertAtBeg(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
        }   
        else{
            newnode.next = head;
            head.prev = newnode;
            head = newnode;
        }
    }
    void insertAtmid(int data){
        Node newnode = new Node(data);
        int count = 1;
        Node temp = head;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        temp = head;
        int v = count/2;
        for(int i=1;i<v;i++){
            temp = temp.next;
        }
        newnode.next = temp.next;
        newnode.prev = temp;
        temp.next.prev = newnode;
        temp.next = newnode;
    }
    void deleteAtBeg(){
        if(head == null){
            System.out.println("underflow");
        }
        else if(head.next == null){
            head = null;
        }
        else{
            head = head.next;
            head.prev = null;
        }
    }
    void deleteAtmid(){
        if(head == null || head.next == null){
            head = null;
            return;
        }
        int count = 0;
        Node temp = head;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        temp = head;
        int v = count/2;
        for(int i=1;i<v;i++){
            temp = temp.next;
        }temp = temp.next;
        temp.next.prev = temp.prev;
        temp.prev.next = temp.next;
    } 
    
    void deleteAtEnd(){
        if(head == null){
            System.out.println("Underflow");
        }
        else if(head.next==null){
            head = null;
        }
        else{
            Node temp = head;
            while(temp.next.next!=null){
                temp = temp.next;
            }temp.next = null;
        }
    }
    void rotate(int d){
        if(head == null || head.next == null){
            return;
        }
        int count = 1;
        Node temp = head;
        while(temp.next!=null){
            count++;
            temp = temp.next;
        }
        Node tail = temp;
        d = d%count;
        if(d==0){
            return;
        }
        temp = head;
        for(int i=0;i<count-d;i++){
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
    }
    boolean palindrom(){
        if(head == null || head.next == null)
        return true;
        Node right = head;
        Node left = head;
        while(right.next!=null){
            right = right.next;
        }
        while(left!=right){
            if(left.data!=right.data){
                return false;
            }
            left = left.next;
            right = right.prev;
        }
        return true;
    }
    void display(){
        if(head == null){
            System.out.println("List is Empty");
        }
        else{
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }System.out.println();
        }
    }
    void display1(){
        if(head == null){
            System.out.println("List is Empty");
        }
        else{
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.prev;
            }System.out.println();
        }
    }
}
public class Main_all{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Linkedlist ll = new Linkedlist();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            ll.insert(sc.nextInt());
        }
        ll.display();
        ll.display1();
        if(ll.palindrom()){
            System.out.println("palindrom");
        }
        else{
            System.out.println("not a palindrom");
        }
    }
}
