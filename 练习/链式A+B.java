import java.util.*;
/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Plus {
    public ListNode plusAB(ListNode a, ListNode b) {
        // write code here
        ListNode result = new ListNode(-1);
        ListNode head = result;
        int jin = 0;
        while(a!=null && b!=null){
            int val = a.val+b.val+jin;
            if(val > 9){
                jin = 1;
            }else{
                jin = 0;
            }
            result.next = new ListNode(val%10);
            result = result.next;
            a = a.next;
            b = b.next;
        }
        while(b!=null){
            int val = b.val+jin;
            if(val > 9){
                jin = 1;
            }else{
                jin = 0;
            }
            result.next = new ListNode(val%10);
            result = result.next;
            b = b.next;
        }
        while(a!=null){
            int val = a.val+jin;
            if(val > 9){
                jin = 1;
            }else{
                jin = 0;
            }
            result.next = new ListNode(val%10);
            result = result.next;
            a = a.next;
        }
        if(jin == 1){
            result.next = new ListNode(1);
        }
        return head.next;
    }
}
