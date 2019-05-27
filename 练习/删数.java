import java.util.*;
class Node{
    Node next;
    int val;
    public Node(int val){
        this.val = val;
    }
}
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        while(sc.hasNext()){
          int n = sc.nextInt();
          Node node = new Node(0);
          Node p = node;
       
          for(int i = 1 ; i < n;i++){
                 p.next = new Node(i);
                 p = p.next;
          }
             //循环链表
            p.next = node;
            
            p = node;
            //开始删除
            while(p.next!=p){
                p = p.next;
                p.next = p.next.next;
                p = p.next;
            }
               System.out.println(p.val);
        }
    }
}
