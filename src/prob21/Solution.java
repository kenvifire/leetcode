package prob21;


import java.util.List;

/**
 * Created by hannahzhang on 15/4/20.
 */
public class Solution {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1== null)
            return l2;
        if(l2==null)
            return l1;

        ListNode h1 = l1;
        ListNode h2 = l2;
        ListNode h;
        ListNode temp = new ListNode(0);
        h = temp;

        while(h1!=null || h2 != null){
            if(h1== null || (h2 != null && h2.val <= h1.val) ){
                ListNode node = new ListNode(h2.val);
                h.next = node;
                h = h.next;
                h2 = h2.next;
                continue;
            }

            if(h2 == null || ( h1 != null && h1.val < h2.val )){
                ListNode node = new ListNode(h1.val);
                h.next = node;
                h = h.next;
                h1 = h1.next;
                continue;
            }
        }
        return temp.next;
    }

    public static void main(String[] args){
        ListNode h1 = new ListNode(5);
        h1.next = new ListNode(3);
        h1.next.next = new ListNode(1);



        ListNode h2 = new ListNode(6);
        h2.next = new ListNode(4);
        h2.next.next = new ListNode(2);

        ListNode result = new Solution().mergeTwoLists(h1,h2);



    }


}
