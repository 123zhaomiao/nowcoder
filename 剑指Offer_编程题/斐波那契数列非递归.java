public class Solution {
    public int Fibonacci(int n) {
        //循环 
        if(n == 0){return 0;}
        if(n == 1){return 1;}
        //斐波那契数列第0个值
        int pre_num = 0;
        //斐波那契数列第1个值
        int cur_num = 1;
        //返回值
        int result = 0;
        while(n >= 2){
            result = pre_num + cur_num;
            pre_num = cur_num;
            cur_num = result;
            n--;
        }
        return result;  
        
    }
}
