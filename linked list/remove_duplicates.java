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
    }
    void remdup(){
        if(head == null)
        return;
        Node temp = head;
        while(temp!=null){
            Node curr = temp;
             while (curr.next != null) {
                if (curr.next.data == temp.data) {
                    curr.next = curr.next.next;
                } else {
                    curr = curr.next;
                }
            }
            temp = temp.next;
        }
    }
    void removelast(int val){
        if(head == null)return;
        Node temp = head;
        int count = 0;
        while(temp.next!=null){
            count++;
            temp = temp.next;
        }
        int v = count-val;
        temp = head;
        for(int i=0;i<v;i++){
            temp = temp.next;
        }temp.next = temp.next.next;
    }
    void swap(int data ,int val){
        int count = 0;
        Node temp = head;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        if(data==val)return;
        Node val1 = head;
        Node val2 = head;
        for(int i=0;i<data;i++){
            val1 = val1.next;
        }
        for(int i=0;i<val;i++){
            val2 = val2.next;
        }
        int newdata = val1.data;
        val1.data = val2.data;
        val2.data = newdata;
    }
    void occuent(int val){
        Node temp = head;
        int max=0;
        int count = 0;
        while(temp!=null){
        if(temp.data == val){
            count++;
        }
        if(max<=count){
            max = count;
        }
        temp = temp.next;
        }
        System.out.println(max);
    }
    void display(){
        if(head == null){
            System.out.print("List is Empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }System.out.println();
    }
}
public class remove_duplicates{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Linkedlist ll = new Linkedlist();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            ll.insert(sc.nextInt());
        }
        ll.display();
        // ll.remdup();
        // ll.display();
        // int v = sc.nextInt();
        // ll.removelast(v);
        // ll.display();
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // ll.swap(a,b);
        // ll.display();
        int s = sc.nextInt();
        ll.occuent(s);
    }
}