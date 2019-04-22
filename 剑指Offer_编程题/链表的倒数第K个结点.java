/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head == null || k<0){return null;}
        ListNode fast = head;
        ListNode slow = head;
        //让快指针先走k步
        while( k > 0){
            if(fast == null){return null;}
            fast = fast.next;
            k--;
        }
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
