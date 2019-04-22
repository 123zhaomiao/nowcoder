/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1 == null){return list2;}
        if(list2 == null){return list1;}
        ListNode p1 = list1;
        ListNode p2 = list2;
        ListNode newList = null;
        ListNode newTail = null;
        while(p1!=null && p2!=null){
            if(p1.val < p2.val){
                if(newList == null){
                    newList = newTail = p1;
                }else{
                    newTail.next = p1;
                    newTail = newTail.next;
                }
                 p1 = p1.next;
            }else{
                if(newList == null){
                    newList = newTail = p2;
                }else{
                    newTail.next = p2;
                    newTail = newTail.next;
                }
                  p2 = p2.next;
            }
        }
        if(p1!=null){
            newTail.next = p1;
        }
        if(p2 != null){
            newTail.next = p2;
        }
        return newList;
    }
}
