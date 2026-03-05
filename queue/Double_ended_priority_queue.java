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
class queue{
    Node front = null;
    Node rear = null;
    boolean isEmpty(){
        return front == null;
    }
    void insert(int data){
        Node newnode = new Node(data);
        if(isEmpty()){
            front = rear = newnode;
            return;
        }
        if(data<front.data){
            newnode.next = front;
            front.prev = newnode;
            front = newnode;
            return;
        }
        if(data>rear.data){
            rear.next = newnode;
            newnode.prev = rear;
            rear = newnode;
            return;
        }
        Node temp = front;
        while(temp!=null&&temp.data<data){
            temp = temp.next;
        }
        newnode.prev = temp.prev;
        newnode.next = temp;
        temp.prev.next = newnode;
        temp.prev = newnode;
    }
    void deletemin(){
        if(isEmpty())return;
        if(rear==front){
            front = rear =null;
        }else{
        front = front.next;
        front.prev = null;
        }
    }
    void deletemax(){
        if(isEmpty())return;
        if(rear==front){
            front = rear =null;
        }else{
            rear = rear.prev;
            rear.next = null;
        }
    }
    void getmin(){
        if(isEmpty())return;
        System.out.println("Min : "+front.data);
    }
    void getmax(){
        if(isEmpty())return;
        System.out.println("max : "+rear.data);
    }
    void display(){
        if(isEmpty())return;
        else{
            Node temp = front;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }System.out.println();
        }
    }
}
public class Double_ended_priority_queue{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        queue qq = new queue();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            qq.insert(sc.nextInt());
        }qq.display();
        qq.deletemax();
        qq.deletemin();
        qq.display();
        qq.getmax();
        qq.getmin();
    }
}
