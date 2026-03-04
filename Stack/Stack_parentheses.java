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
        return top == null;
    }
    char pop(){
        if(top==null) return '0';
        char val = top.data;
        top = top.next;
        return val;
    }
    char peek(){
    if(top==null) return '0';
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
public class Stack_parentheses{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(isValid(str));
    }
    public static boolean isValid(String str){
        Scanner sc = new Scanner(System.in);
        Stack st = new Stack();
        boolean valid = true;
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c=='('||c=='{'||c=='['){
                st.push(c);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                char top = st.pop();
                if(c==')'&&top!='(')return false;
                if(c=='}'&&top!='{')return false;
                if(c==']'&&top!='[')return false;
            }
        }
        return st.isEmpty();
    }
}
