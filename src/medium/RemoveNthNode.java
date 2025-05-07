package medium;

/**
 * Definition for singly-linked list.
 * */
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}


class SolutionNthNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // using the two pointer app
        // first poiint will keep on going
        // second point will start after nth node from first
        // if first gone null then remove the second pointer index
        if(head==null)
            return null;
        ListNode fp = head;
        ListNode sp = null;
        boolean secondTrack = false;
        int count = 0;
        while(fp!=null){
            if(fp.next==null && secondTrack){
                sp.next = sp.next.next;
            }
            fp = fp.next;
            if(secondTrack){
                sp = sp.next;
            }
            if(count<n-1){
                count++;
            }else if(!secondTrack){
                if(fp.next==null){
                    head = head.next;
                    return head;
                }
                sp = head;
                secondTrack = true;
            }
        }
        return head;
    }
}

public class RemoveNthNode {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);

        SolutionNthNode solution = new SolutionNthNode();
        ListNode result = solution.removeNthFromEnd(head, 1);

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
