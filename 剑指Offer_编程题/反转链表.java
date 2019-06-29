/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/

public class Solution {
    public ListNode ReverseList(ListNode head) {
        if(head == null || head.next == null){return head;}
        ListNode pre = head;
        ListNode cur = head.next;
        ListNode temp = null;
        while(cur!=null){
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        head.next = null;
        return pre;
    }
}
