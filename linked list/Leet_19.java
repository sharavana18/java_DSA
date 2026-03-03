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
        int count = 0;
        Node temp = head;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        int k = count-val;
        int c = count-k;
        Node emp = head;
        for(int i=0;i<c;i++){
            emp = emp.next;
        }emp.next = emp.next.next;
    }
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }System.out.println();
    }
}
public class Leet_19{
    public static void main(String[] args){
        Linkedlist ll = new Linkedlist();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            ll.insertAtEnd(sc.nextInt());
        }
        ll.display();
        int v = sc.nextInt();
        ll.delete(v);
        ll.display();
    }
}
