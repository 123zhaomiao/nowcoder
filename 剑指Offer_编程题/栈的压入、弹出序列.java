import java.util.ArrayList;
import java.util.Stack;
public class Solution {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if(pushA.length!=popA.length){return false;}
        //1.借助辅助栈
        Stack<Integer> stack = new Stack<>();
        //用于指向popA
        int index = 0;
        for(int i = 0; i < pushA.length;i++){
            stack.push(pushA[i]);
            while(!stack.isEmpty() && (stack.peek() == popA[index])){
                stack.pop();
                index++;
            }
        }
        
        return stack.isEmpty();
    }
}
