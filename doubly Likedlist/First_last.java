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
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }temp.next = newnode;
        newnode.prev = temp;
    }
    void newn(){
        Node temp = head;
        int c = 1;
        while(temp.next!=null){
            c++;
            temp = temp.next;
        }
        Node curr = temp;
        temp = head.next;
        if(c%2==1){
        System.out.print(head.data);
        for(int i=0;i<(c/2);i++){
            System.out.print(" ->"+curr.data);
            curr = curr.prev;
            System.out.print(" ->"+temp.data);
            temp = temp.next;
        }
        }
        if(c%2==0){
        System.out.print(head.data);
        System.out.print(" ->"+curr.data);
        curr = curr.prev;
        for(int i=0;i<(c/2)-1;i++){

            System.out.print(" ->"+temp.data);
            temp = temp.next;
            System.out.print(" ->"+curr.data);
            curr = curr.prev;
        }
        }
    }
    void display(){
        if(head == null){
            return;
        }
        Node temp = head.next;
        System.out.print(head.data);
        while(temp!=null){
            System.out.print(" ->"+temp.data);
            temp = temp.next;
        }System.out.println();
    }
}
public class First_last{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Linkedlist ll = new Linkedlist();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            ll.insert(sc.nextInt());
        }
        ll.display();
        ll.newn();
    }
}
