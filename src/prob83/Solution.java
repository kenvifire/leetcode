package prob83;


/**
 * Created by hannahzhang on 15/4/20.
 */
public class Solution {

    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)
            return head;

        ListNode h1 = head;
        ListNode h2 = head.next;

        while (h2 != null){
            while(h2 != null && h1.val == h2.val  ) {

                h1.next = h2.next;
                h2 = h2.next;
            }
            if(h2 == null)
                break;
            h1 = h1.next;
            h2 = h2.next;

        }
        return head;

    }

    public static void main(String[] args){
        ListNode h1 = new ListNode(5);
        h1.next = new ListNode(3);
        h1.next.next = new ListNode(1);
        h1.next.next.next = new ListNode(1);
        h1.next.next.next.next = new ListNode(1);
        h1.next.next.next.next.next = new ListNode(2);
        h1.next.next.next.next.next.next = new ListNode(2);





        ListNode result = new Solution().deleteDuplicates(h1);

        System.out.println(result.next);



    }


}
