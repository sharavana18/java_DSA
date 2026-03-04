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
        return top == null;
    }
    void pop(){
        if(top==null) return ;
        top = top.next;
    }
    int peek(){
    if(top==null) return 0;
    return top.data;
}
int getmax(){
    if(top==null)return 0;
    Node temp = top;
    int max = top.data;
    while(temp!=null){
        if(temp.data>=max){
            max = temp.data;
        }temp = temp.next;
    }return max;
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
public class Getmax{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack st = new Stack();
        System.out.println("1.push 2.pop 3.peek 4.getmax 5.display");
        while(true){
            int n = sc.nextInt();
            switch(n){
                case 1 :
                    System.out.print("enter : ");
                    int v = sc.nextInt();
                    st.push(v);
                    break;
                case 2 :
                    st.pop();
                    break;
                case 3 :
                    st.peek();
                    break;
                case 4 :
                    System.out.println("Max : "+st.getmax());
                    break;
                case 5 :
                    st.display();
                    break;
                default :
                    System.exit(0);
            }
        }
    }
}
