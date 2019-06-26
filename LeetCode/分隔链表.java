/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode[] splitListToParts(ListNode root, int k) {
        //1.计算链表的长度
        ListNode head = root;
        int length = 0;
        while(head != null){
            length++;
            head = head.next;
        }
        ListNode[] node = new ListNode[k]; 
        
        
        
        //2.两种情况
        //2.1 链表长度小于k,每个链表只有一个元素
        ListNode pre = root;
        ListNode cur = root;
        ListNode nn = root;
        int i = 0;
        if(length <= k){
            while(cur != null){
                cur = cur.next;
                pre.next = null;
                node[i] = pre;
                i++;
                pre = cur;
            }     
        //2.2 链表长度大于k,前length%k个结点元素个数为length/k+1,后面为length/k个
        }else{
            int sum = length % k;
            int count  = length / k;
            int n = 0;
            while(sum != 0){
                n = count+1;
                while(n!=0){ 
                    pre = cur;
                    cur = cur.next;
                    n--;
                }
                pre.next = null;
                node[i] = nn;
                nn = cur;
                i++;
                sum--;
            }
            
            while(cur != null){
                n = count;
                while(n!=0){ 
                    pre = cur;
                    cur = cur.next;
                    n--;
                }
                pre.next = null;
                node[i] = nn;
                nn =cur;
                i++;
            }
        }
        return node;
    }
}
