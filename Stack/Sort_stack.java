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
    boolean isEmpty(){
        return top==null;
    }
    int peek(){
        if(top==null)return 0;
        return top.data;
    }
    int pop(){
        if(top==null)return 0;
        int val = top.data;
        top=top.next;
        return val;
    }
    void display(){
        if(top==null)return;
        Node temp = top;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }System.out.println();
    }
    void insertSorted(int k){
        if(isEmpty()||peek()<k){
            push(k);
            return ;
        }  
        int temp = pop();
        insertSorted(k);
        push(temp);
    }
    void sortStack(){
         if (!isEmpty()) {
            int temp = pop();
            sortStack();
            insertSorted(temp);
        }
    }
}
public class Sort_stack{
    public static void main(String[] args){
        Stack st = new Stack();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            st.push(sc.nextInt());
        }st.display();
        st.sortStack();
        st.display();
    }
}
