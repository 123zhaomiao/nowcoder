/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        //首先计算两个长度
        int len1 = 0;
        int len2 = 0;
        ListNode cur1 = headA;
        ListNode cur2 = headB;
        
        while(cur1 != null){
            cur1 = cur1.next;
            len1++;
        }
        while(cur2 != null){
            cur2 = cur2.next;
            len2++;
        }
        cur1 = headA;
        cur2 = headB;
        //长的先走两个链表之间的差
        int len = len1 > len2 ? len1-len2:len2-len1;
        if(len1 > len2){
            while(len != 0){
                cur1 = cur1.next;
                len--;
            }
        }else if(len1 < len2){
            while(len != 0){
                cur2 = cur2.next;
                len--;
            }
        }
        
        //一起走
        while(cur1 != null){
            if(cur1 == cur2 ){
                return cur1;
            }
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        return null;
    } 
}
