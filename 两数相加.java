/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //最终返回的链表为l3
        ListNode l3 = null;
        int temp = 0;
        int flag = 0;

        ListNode p1 = l1;
        ListNode p2 = l2;
    
        //循环
        while(p1!=null && p2!=null)
        {
            temp = p1.val + p2.val +flag;
            //如果两数相加大于10，则有进位,将进位标志设置为1
            if(temp >= 10)
            {
                flag = 1;
                l3=insert(l3,temp - 10);  
            }else
            {
                flag = 0;
                l3=insert(l3,temp);  
            }
            p1 = p1.next;
            p2 = p2.next;
        }   
        while(p1 != null)
        {
            if(p1.val+flag >= 10)
            {
               l3 = insert(l3,p1.val+flag -10);
               flag =1;
            }else
            {
                l3=insert(l3,p1.val+flag );
                flag=0;
            }
            p1=p1.next;
        }
        while(p2 != null)
        {
            if(p2.val+flag >= 10)
            {
               l3 = insert(l3,p2.val+flag -10);
               flag =1;
            }else
            {
                l3=insert(l3,p2.val+flag );
                flag=0;
            }
            p2=p2.next;
        }
        if(flag == 1)
        {
            l3 = insert(l3,1);
        }
        return l3;
    }
    public ListNode insert(ListNode l3,int temp)
    {
        ListNode node = new ListNode(temp);   
        ListNode p = null;
        if(node == null)
        {
            return null;
        }
        if(l3 == null)
        {
            l3 = node;
            node.next = null;
        }
        else{
            p=l3;
            while(p.next!=null)
            {
                p=p.next;
            }
            p.next=node;
            node.next=null;
        }
        return l3;
    }
}
