import java.util.*;
class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
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
    void display(){
        if(head == null){
            System.out.println(" List is Empty");
            return;
        }
        else{
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }System.out.println();
        }
    }
    void insertAtmid(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }
        Node temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        int b = (count+1)/2;
        temp = head;
        for(int j=1;j<b;j++){
            temp = temp.next;
        }
        newnode.next = temp.next;
        newnode.prev = temp;
        temp.next.prev = newnode;
        temp.next = newnode;
    }
    void deleteAtBeg(){
        if(head == null){
            System.out.println("Underflow");
            return;
        }
        else{
            head = head.next;
            head.prev = null;
        }
    }
    void deleteAtmid(){
        if(head==null){
            System.out.println("Underflow");
            return;
        }
        else if(head.next == null){
            head = null;
            return;
        }
        else{
            int count = 0;
            Node temp = head;
            while(temp!=null){
                count++;
                temp = temp.next;
            }
            temp = head;
            int p = (count)/2;
            for(int l=0;l<p;l++){
                temp=temp.next;
            }temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
    }
    void deleteAtEnd(){
        if(head == null){
            System.out.println("Underflow");
        }
        else if(head.next == null){
            head = null;
        }
        else{
            Node temp = head;
            while(temp.next.next!=null){
                temp = temp.next;
            }temp.next = null;
        }
    }
    void display1(){
        if(head == null){
            System.out.println(" List is Empty");
            return;
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
public class Doubly_delete_mid{
    public static void main(String[] args){
        Linkedlist ll = new Linkedlist();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            ll.insert(sc.nextInt());
        }
        ll.display();
        ll.deleteAtmid();
        ll.display();
        ll.display1();
        }
}