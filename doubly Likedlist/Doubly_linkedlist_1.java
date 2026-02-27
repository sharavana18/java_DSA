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
        }
        else{
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }temp.next = newnode;
            newnode.prev = temp;
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
public class Doubly_linkedlist_1{
    public static void main(String[] args){
        Linkedlist ll = new Linkedlist();
        Scanner sc = new Scanner(System.in);
        int val;
        do{
           val = sc.nextInt();
           if(val!=-1)
           ll.insert(val);
        }while(val!=-1);
        ll.display();
        ll.display1();
    }
}