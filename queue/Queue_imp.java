import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class Queue{
    Node top = null;
    void enqueue(int data){
        Node newnode = new Node(data);
        if(top==null){
            top=newnode;
            return;
        }
        else{
            Node temp = top;
            while(temp.next!=null){
                temp = temp.next;
            }temp.next=newnode;
        }
    }
    void dequeue(){
        if(top==null)return;
        else{
            Node temp = top;
            while(temp.next.next!=null){
                temp = temp.next;
            }temp.next=null;
        }
    }
    int peek(){
        return top.data;
    }
    void display(){
        if(top==null)return;
        else{
            Node temp = top;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }System.out.println();
        }
    }
}
public class Queue_imp{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Queue qq = new Queue();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            qq.enqueue(sc.nextInt());
        }qq.display();
        qq.dequeue();
        qq.display();
    }
}