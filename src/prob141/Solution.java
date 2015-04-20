package prob141;


import java.util.List;

/**
 * Created by hannahzhang on 15/4/20.
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }

        ListNode s1 = head;
        ListNode s2 = head;
        while(s1.next !=null  && s2.next != null && s2.next.next!=null){
            s1 = s1.next;
            s2 = s2.next.next;
            if(s1 == s2){
                return true;
            }
        }
        return false;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args){
        ListNode head = new ListNode(1);
//        System.out.println(new Solution().hasCycle(head));
//
//        head.next = head;
//        System.out.println(new Solution().hasCycle(head));

        head.next = new ListNode(2);
        System.out.println(new Solution().hasCycle(head));
    }
}
