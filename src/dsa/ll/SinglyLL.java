package dsa.ll;


import java.util.Stack;

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
        while (currentNode != null) {
            presentNode = currentNode;
            currentNode = currentNode.next;
        }
        presentNode.next = newNode;
        return head;
    }

    public static boolean searchByData(Node head, int data) {
        if (head == null) {
            return false;
        }

        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.data == data) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;

    }

    public static void printLL(Node head) {
        Node temp = head;
        if (head == null) {
            System.out.println("** List is empty **");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node reverseRecursiveLL(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node rest = reverseRecursiveLL(head.next);
        head.next.next = head;
        head.next = null;
        return rest;
    }

    public static boolean searchNodeByRecursive(Node head, int data) {
        if (head == null) {
            return false;
        }
        if (head.data == data) {
            return true;
        }
        return searchNodeByRecursive(head.next, data);
    }

    public static Node reverseNodeByStack(Node head) {
        Stack<Node> stack = new Stack<>();
        Node temp = head;
        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }
        head = stack.pop();
        temp = head;
        while (!stack.isEmpty()) {
            temp.next = stack.pop();
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    public static Node deleteHeadNode(Node head) {
        if (head == null)
            return head;

        head = head.next;
        return head;
    }

    public static Node deleteLinkedList(Node head) {
        return null;
    }

    public static Node findNthNode(Node head, int n) {
        if(head==null) {
            return null;
        }
        if(n==1) {
            return head;
        }
        return findNthNode(head.next,n-1);
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
        head = LLOperation.insertAtPosition(head, 14, 5);
        head = LLOperation.insertAtEnd(head, 20);
        var check = LLOperation.searchByData(head, 3);
        System.out.println("Is data present in the list: " + check);
        check = LLOperation.searchNodeByRecursive(head, 3);
        System.out.println("Is data present in the list recursive: " + check);
        LLOperation.printLL(head);
        System.out.println();
        head = LLOperation.reverseRecursiveLL(head);
        LLOperation.printLL(head);
        System.out.println("Reverse by stack");
        head = LLOperation.reverseNodeByStack(head);
        LLOperation.printLL(head);
        System.out.println("Delete head node");
        head = LLOperation.deleteHeadNode(head);
        LLOperation.printLL(head);
        System.out.println("Delete linked List");
        head = LLOperation.deleteLinkedList(head); // set null to the head, java garbage collector will take care of it
        LLOperation.printLL(head);
        System.out.println("Find nth node");
        head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(5);
        head.next.next.next = new Node(7);
        System.out.println(LLOperation.findNthNode(head, 3).data);
    }
}
