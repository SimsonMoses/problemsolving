package medium;



public class PartitionList {
    public static void main(String[] args) {
        PartitionList partitionList = new PartitionList();
        ListNode head = new ListNode(1);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(2);
        int x = 3;
        ListNode result = partitionList.partition(head, x);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }

    public ListNode partition(ListNode head, int x) {

        if(head == null)
            return head;
        ListNode bh = new ListNode(head.val); // before head
        ListNode b = bh;
        ListNode ah = new ListNode(head.val); // after head
        ListNode a = ah;

        while(head!=null){
            if(head.val<x){
                b.next = new ListNode(head.val);
                b = b.next;
            }else{
                a.next = new ListNode(head.val);
                a = a.next;
            }
            head = head.next;
        }
        a.next = null;
        b.next = ah.next;
        return bh.next;
    }
}
