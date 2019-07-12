/**
*    public class ListNode {
*        int val;
*        ListNode next = null;
*        ListNode(int val) {
*            this.val = val;
*        }
*    }
*/

import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<Integer>();
       //如果没有结点返回空
       if(listNode == null){
           return list;
       }
        
        //如果只有一个结点返回这个结点
       if(listNode.next == null){
           list.add(listNode.val);
           return list;
       }
        //有两个或者两个以上的结点
       ListNode pre = listNode;
       ListNode cur = listNode.next;
       ListNode temp = null;
       while(cur!=null){
           temp = cur.next;
           cur.next = pre;
           pre = cur;
           cur = temp;
       }
        listNode.next = null;
        while(pre!=null){
            list.add(pre.val);
            pre = pre.next;
        }
        return list;
    }
}
