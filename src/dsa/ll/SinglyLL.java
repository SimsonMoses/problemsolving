package dsa.ll;


class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LLOperation{
    public static Node insertAtFront(Node head, int newDate){
        Node  newNode = new Node(newDate);
        newNode.next = head;
        return newNode;
    }

    public static Node insertBeforeKey(Node head, int newData, int positionData){

        if(head==null){
            return null;
        }
        Node newNode = new Node(newData);
        if(head.data==positionData){
            newNode.next = head;
            return newNode;
        }
        Node cur = head; // current Node
        Node prev = head; // previous Node
        while(cur!=null && cur.data!=positionData){
            prev = cur;
            cur = cur.next;
        }
        if(cur==null){
            return head;
        }
        prev.next = newNode;
        newNode.next = cur;
        return head;
    }

    public static Node insertAtMiddle(Node head, int newData, int positionData){
        Node temp = head;
        while(temp!=null){
            if(temp.data==positionData)
                break;
            temp = temp.next;
        }
        if(temp==null)
            return head;
        Node newNode = new Node(newData);
        if(temp.next!=null)
            newNode.next = temp.next;
        temp.next = newNode;
        return head;

    }

    public static void printLL(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }
}

public class SinglyLL {
    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(5);

        head = LLOperation.insertAtFront(head, 1);
        head = LLOperation.insertAtMiddle(head, 4, 5);
        head = LLOperation.insertBeforeKey(head, 8, 3);
        LLOperation.printLL(head);
    }
}
