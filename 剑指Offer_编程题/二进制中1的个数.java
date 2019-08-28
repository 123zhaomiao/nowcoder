public class Solution {
    public int NumberOf1(int n) {
        //方法1 数据每次都右移一位 &1如果是1 证明最低位是1 
        int count = 0;
        for(int i = 0;i < 32;i++){
             if(((n >> i) & 1) == 1){
                 count++;
             }
        } 
        
        return count;
        //方法2 
        int count = 0;
        while(n!=0){
            n = ( n & (n-1));
            count++;
        }
        return count;
    }
}
