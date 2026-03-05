import java.util.*;
class Node {
    int data;
    Node next;
    Node prev;
    Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
class DequeLinkedList {
        Node front = null;
        Node rear = null;
    boolean isEmpty() {
        return front == null;
    }
    void insertFront(int val) {
        Node newNode = new Node(val);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            newNode.next = front;
            front.prev = newNode;
            front = newNode;
        }
    }
    void insertRear(int val) {
        Node newNode = new Node(val);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            newNode.prev = rear;
            rear = newNode;
        }
    }
    void deleteFront() {
        if (isEmpty()) {
            return;
        }
        if (front == rear) {
            front = rear = null;
        }else {
            front = front.next;
            front.prev = null;
        }
    }
    void deleteRear() {
        if (isEmpty()) {
            return;
        }
        if (front == rear) {
            front = rear = null;
        } else {
            rear = rear.prev;
            rear.next = null;
        }
    }
    void display() {
        if (isEmpty()) {
            return;
        }
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
public class Double_ended_queue {
    public static void main(String[] args) {
        DequeLinkedList dq = new DequeLinkedList();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            dq.insertFront(sc.nextInt());
        }
        int m = sc.nextInt();
        for(int j=0;j<m;j++){
            dq.insertRear(sc.nextInt());
        }dq.display();
        dq.deleteFront();
        dq.deleteRear();
        dq.display();
    }
}