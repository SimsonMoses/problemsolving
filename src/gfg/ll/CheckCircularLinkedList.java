package gfg.ll;


public class CheckCircularLinkedList {
    public static boolean isCircular(Node head) {
        // Your code here

        if (head==null){
            return false;
        }
        Node temp = head;
        temp = temp.next;
        while(temp!=null){
            if(temp==head)
                return true;
            temp = temp.next;
        }
        return false;
    }
    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = node;
        System.out.println(isCircular(node));
    }
}
