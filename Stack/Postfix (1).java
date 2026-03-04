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
    int pop(){
        if(top==null) return 0;
        int val = top.data;
        top = top.next;
        return val;
    }
    int peek(){
    if(top==null) return 0;
    return top.data;
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
public class Postfix{
    public static int postfix(String str){
        Stack st = new Stack();
        boolean valid = true;
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c>='0'&&c<='9'){
                st.push(c-'0');
            }
            else{
                int val2 = st.pop();
                int val1 = st.pop();
                    if(c=='+')
                        st.push(val1+val2);
                    else if(c=='-')
                        st.push(val1-val2);
                    else if(c=='*')
                        st.push(val1*val2);
                    else if(c=='/')
                        st.push(val1/val2);
                }
            }
        return st.pop();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(postfix(str));
    }
}
