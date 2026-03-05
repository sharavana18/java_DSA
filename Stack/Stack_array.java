import java.util.*;
class StackArray {
    int top;
    int capacity;
    int[] stack;
    StackArray(int size){
        capacity = size;
        stack = new int[capacity];
        top = -1;
    }
    boolean isFull(){
        return top == capacity - 1;
    }
    boolean isEmpty(){
        return top == -1;
    }
    void push(int data){
        if (isFull())return;
        stack[++top] = data;
    }
    int pop(){
        if (isEmpty())return -1;
        return stack[top--];
    }
    int peek(){
        if (isEmpty())return -1;
        return stack[top];
    }
    void display(){
        if (isEmpty()){
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}
public class Stack_array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StackArray st = new StackArray(n);
        for(int i=0;i<n;i++){
            st.push(sc.nextInt());
        }
        st.display();
        System.out.println(st.pop());
        st.display();
        System.out.println(st.peek());
    }
}