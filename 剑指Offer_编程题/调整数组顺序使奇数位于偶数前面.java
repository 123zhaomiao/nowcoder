import java.util.ArrayList;
public class Solution {
    public void reOrderArray(int [] array) {
        //方法1 设置两个辅助数组
        ArrayList<Integer> os = new ArrayList<>();
        ArrayList<Integer> js = new ArrayList<>();
        //遍历数组，将偶数放入os、奇数放入js
        for(int i = 0;i < array.length ; i++){
            if(array[i]%2==0){
                os.add(array[i]);
            }else{
                js.add(array[i]);
            }
        }      
        //先放奇数、后方偶数
        for(int i = 0;i < js.size(); i++){
            array[i] = js.get(i);
        }
        for(int i = 0; i < os.size();i++){
            array[i+js.size()] = os.get(i);
        }
    }
}

import java.util.ArrayList;
public class Solution {
    public void reOrderArray(int [] array) {
        //i是从左向右的第一个偶数
        //j是从左向后的第一个奇数
        //将【i……j-1】的元素整体右移
        int i = 0;
        int j = 0;
        while( j < array.length){
            while(i < array.length && array[i]%2 != 0){
                i++;
            }
            j = i+1;
            while(j < array.length && array[j]%2 == 0){
                j++;
            }
            if(j >= array.length){break;}
            //到此为止i指向的是从左到右第一个偶数、j指向的是从左到右第一个奇数
            int k = array[j];
            int z = j-1;
            while(z >= i){
                array[z+1] = array[z];
                z--;
            }
            array[i] = k;
            i++;
        }
    }
}
