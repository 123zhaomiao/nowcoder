import java.util.Stack;

public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        //思想 将栈2中的元素挪到栈1 入栈1
        if(stack2.isEmpty()){
            stack1.push(node);
        }else{
            while(!stack2.isEmpty()){
                stack1.push(stack2.pop());
            }
            stack1.push(node);
        }
    }
    
    public int pop() {
        //思想 将栈1 里面的元素挪到栈2 栈2出栈
        if(!stack2.isEmpty()){
            //1.栈2不等于空 直接出栈
            return stack2.pop();
        }else{
            //2.将栈1的元素全部入栈2
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        }
    }
}
