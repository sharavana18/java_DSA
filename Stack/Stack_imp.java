import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class Stack{
    Node top = null;
    void push(int data){
        Node newnode = new Node(data);
        newnode.next = top;
        top = newnode;
    }
    void pop(){
        if(top==null)return;
        top = top.next;
    }
    void peek(){
        System.out.println(top.data);
    }
    void display(){
        if(top==null)return;
        else{
            Node temp = top;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }System.out.println();
        }
    }
}
public class Stack_imp{
    public static void main (String[] args) {
        Stack stack = new Stack();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            stack.push(sc.nextInt());
        }
        stack.display();
        stack.peek();
    }
}