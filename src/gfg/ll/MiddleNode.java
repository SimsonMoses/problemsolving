package gfg.ll;


class LLOperation {
    public static Node insertAtFront(Node head, int newDate) {
        Node newNode = new Node(newDate);
        newNode.next = head;
        return newNode;
    }
    public static int getMiddle(Node head) {
        // Your code here.
        Node temp = head;
        int n = 0;
        while(temp!=null){
            n++;
            temp = temp.next;
        }
        if(n%2==0){
            n = (n/2)+1;
        }else{
            n = (n/2)+1;
        }
        temp = head;
        for(int i=1;i<n;i++){
            temp=temp.next;
        }
        return temp.data;
    }
    public static void printLL(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class MiddleNode {
    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(5);

        head = LLOperation.insertAtFront(head, 1);
        head = LLOperation.insertAtFront(head, 5);
        head = LLOperation.insertAtFront(head, 3);
        head = LLOperation.insertAtFront(head, 5);
        head = LLOperation.insertAtFront(head, 20);
        head = LLOperation.insertAtFront(head, 20);
        LLOperation.printLL(head);
        System.out.println(LLOperation.getMiddle(head));
    }
}
