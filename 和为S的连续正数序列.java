import java.util.ArrayList;
public class Solution {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
       ArrayList<ArrayList<Integer>> result = new  ArrayList<ArrayList<Integer>>();
       int res = 0; 
       for(int i = 1;i <= sum/2+1 ; i++){
           res = i;
           for(int j = i+1; j <= sum /2+1;j++){
               res += j;
               if(res == sum){
                   ArrayList<Integer> list = new ArrayList<Integer>();
                   int k = i;
                   while(k <= j){
                       list.add(k);
                       k++;
                   }
                   result.add(list);
                   break;
               }
               if(res > sum){break;}
           }
       }
        return result;
        //双指针技术
       //就是相当于有一个窗口，窗口的左右两边就是两个指针，我们根据窗口内值之和来确定窗口的位置和宽度
       ArrayList<ArrayList<Integer>> result = new  ArrayList<ArrayList<Integer>>();
       int low = 1;
       int high = 2;
       while(low < high){
           //等差数列求和
           int res = (high + low)*(high - low + 1)/2;
           if(sum == res){
               ArrayList<Integer> list = new ArrayList<>();
               for(int i = low ;i <= high ;i++){
                   list.add(i);
               }
               result.add(list);
               high++;
           }else if( res > sum){
               low++;
           }else{
               high++;
           }
       }
       return result;
    }
}
