import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class Linkedlist{
    Node head = null;
    void insertAtEnd(int data){
        Node newnode = new Node(data);
        if(head == null)
        head = newnode;
        else{
            Node temp = head;
            while(temp.next!=null){
                temp=temp.next;
            }temp.next = newnode;
        }
    }
    void delete(int val){
       Node temp=head;
       while(temp!=null&&temp.next!=null){
           if(temp.next.data==val){
               temp.next = temp.next.next;
           }temp = temp.next;
       }
    }
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }System.out.println();
    }
}
public class Leet_237{
    public static void main(String[] args){
        Linkedlist ll = new Linkedlist();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            ll.insertAtEnd(sc.nextInt());
        }
        ll.delete(30);
        ll.display();
    }
}
