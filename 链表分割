import java.util.*;

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Partition {
    public ListNode partition(ListNode pHead, int x) {
        ListNode min = new ListNode(0);
        ListNode max = new ListNode(0);
        
        ListNode minNode = min;
        ListNode maxNode = max;
        ListNode cur = pHead;
        
        while(cur != null){
            if(cur.val < x){
                minNode.next =  new ListNode(cur.val);
                minNode = minNode.next;
            }else{
               maxNode.next = new ListNode(cur.val);
               maxNode = maxNode.next;
            }
              cur = cur.next;
        }
        minNode.next = max.next;
        return min.next;
    }
}
