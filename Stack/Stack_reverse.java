import java.util.*;
class Node{
    char data;
    Node next;
    Node(char data){
        this.data = data;
        this.next = null;
    }
}
class Stack{
    Node top = null;
    void push(char data){
        Node newnode = new Node(data);
        newnode.next = top;
        top = newnode;
    }
    boolean isEmpty(){
        return top = null;
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
public class Stack_reverse{
    public static void main (String[] args) {
        Stack stack = new Stack();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i=0;i<str.length();i++){
            // char ch = str.charAt(i);
            stack.push(str.charAt(i));
        }stack.display();
    }
}