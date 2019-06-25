import java.util.Arrays;
public class Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
        StringBuffer str = new StringBuffer();
        for(int i = 1 ;i <= n;i++){
            str.append(String.valueOf(i));
        }
        
        //计算字符串中1的个数
        String s = str.toString();
        char c[] = s.toCharArray();
        Arrays.sort(c);
        int i = 0;
        int count = 0;
        int flag = 0;
        for(i = 0 ; i < c.length;i++){
            while(i < c.length && c[i] == '1'){
                count++;
                i++;
                flag = 1;
            }
            if(flag == 1){break;}
        }
        return count;
    }
}
