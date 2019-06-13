public class Plus {
    public ListNode plusAB(ListNode a, ListNode b) {
        // write code here
        if(a == null || b == null){
            return null;
        }
        int add = 0;
        ListNode head = new ListNode(-1);
        ListNode resCur = head;
        ListNode curA = a;
        ListNode curB = b;
        while(curA != null || curB != null){
            if(curA != null && curB !=null){
                resCur.next = new ListNode((curA.val+curB.val+add)%10);
                resCur = resCur.next;
                add = (curA.val+curB.val+add)/10;
                curA = curA.next;
                curB = curB.next;
            }else if(curA != null){
                resCur.next = new ListNode((curA.val+add)%10);
                resCur = resCur.next;
                add = (curA.val+add)/10;
                curA = curA.next;
            }else{
                resCur.next = new ListNode((curB.val+add)%10);
                resCur = resCur.next;
                add = (curB.val+add)/10;
                curB = curB.next;
            }
        }
        if(add > 0){
            resCur.next = new ListNode(add);
            resCur = resCur.next;
        }
        return head.next;
    }
}
