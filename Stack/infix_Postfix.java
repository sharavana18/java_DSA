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
public class infix_Postfix{
    static int prec(char ch){
        if(ch=='+'||ch=='-')return 1;
        if(ch=='*'||ch=='/')return 2;
        if(ch=='^')return 3;
        return -1;
    }
    static String postfix(String str){
        Stack stack = new Stack();
        String post = "";
        for(int i=0;i<str.length();i++){
        char c = str.charAt(i);
        if((c>='a' && c<='z') || (c>='A' && c<='Z') || (c>='0' && c<='9')){
            post+=c;
        }
        else if(c=='('){
            stack.push(c);
        }
        else if(c==')'){
            while(!stack.isEmpty()&&stack.peek()!='('){
                post+=stack.pop();
            }
            stack.pop();
        }
        else{
            while(!stack.isEmpty()&&prec(stack.peek())>=prec(c)){
                post+=stack.pop();
            }
            stack.push(c);
        }
        }
        while(!stack.isEmpty()){
            post+=stack.pop();
        }
        return post;
    }
    public static void main (String[] args) {
        Stack stack = new Stack();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(postfix(str));
    }
}
