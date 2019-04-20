
import java.util.ArrayList;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        //方法一 暴力
        if(array.length == 0){
            return 0;
        }
        int min = array[0];
        for(int i = 1; i < array.length ; i++){
             //非减数组的旋转数组分为两个递增数组，如果遇到比min小的直接返回即可
            if(array[i] < min){
                min = array[i];
                return min;
            }
        }
        return min;
        //方法二 ：数组排序
        if(array.length == 0){
            return 0;
        }
        Arrays.sort(array);
        return array[0];
    }
}


