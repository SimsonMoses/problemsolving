package dsa.ll;


class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LLOperation {
    public static Node insertAtFront(Node head, int newDate) {
        Node newNode = new Node(newDate);
        newNode.next = head;
        return newNode;
    }

    public static Node insertBeforeKey(Node head, int newData, int positionData) {

        if (head == null) {
            return null;
        }
        Node newNode = new Node(newData);
        if (head.data == positionData) {
            newNode.next = head;
            return newNode;
        }
        Node cur = head; // current Node
        Node prev = head; // previous Node
        while (cur != null && cur.data != positionData) {
            prev = cur;
            cur = cur.next;
        }
        if (cur == null) {
            return head;
        }
        prev.next = newNode;
        newNode.next = cur;
        return head;
    }

    public static Node insertAtMiddle(Node head, int newData, int positionData) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == positionData)
                break;
            temp = temp.next;
        }
        if (temp == null)
            return head;
        Node newNode = new Node(newData);
        if (temp.next != null)
            newNode.next = temp.next;
        temp.next = newNode;
        return head;

    }

    // insert at the position
    public static Node insertAtPosition(Node head, int newData, int position) {
        Node newNode = new Node(newData);
        if (position == 1) {
            newNode.next = head;
            return newNode;
        }
        Node currentNode = head;
        for (int i = 1; i < position && currentNode != null; i++) {
            currentNode = currentNode.next;
        }
        if (currentNode == null) {
            return head;
        }
        newNode.next = currentNode.next;
        currentNode.next = newNode;
        return head;

    }
    // insert at the end
    public static Node insertAtEnd(Node head, int newData) {
        Node newNode = new Node(newData);
        if (head == null) {
            return null;
        }
        Node currentNode = head;
        Node presentNode = head;
        while (currentNode !=null){
            presentNode = currentNode;
            currentNode = currentNode.next;
        }
        presentNode.next = newNode;
        return head;
    }

    public static boolean searchByData(Node head, int data){
        if(head == null){
            return false;
        }

        Node currentNode = head;
        while(currentNode != null){
            if(currentNode.data == data) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;

    }

    public static void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

    public static boolean searchNodeByRecursive(Node head, int data){
        if (head == null){
            return false;
        }
        if(head.data == data) {
            return true;
        }
        return searchNodeByRecursive(head.next, data);
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
        head = LLOperation.insertAtPosition(head,14,5);
        head = LLOperation.insertAtEnd(head,20);
        var check = LLOperation.searchByData(head, 3);
        System.out.println("Is data present in the list: "+check);
        check = LLOperation.searchNodeByRecursive(head, 3);
        System.out.println("Is data present in the list recursive: "+check);
        LLOperation.printLL(head);
    }
}
