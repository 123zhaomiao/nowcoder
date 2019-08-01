import java.util.ArrayList;
import java.util.Collections;
public class Solution {
    public ArrayList<String> Permutation(String str) {
       ArrayList<String> list = new ArrayList<>();
        
       if(str == null || str.length() == 0){
           return list;
       }
       char [] c = str.toCharArray();
       dfs(c,0,list);
       Collections.sort(list);
       return list;
    }
    private static void dfs(char [] c,int index,ArrayList<String> list){
        if(index == c.length){
            String s = String.valueOf(c);
            if(!list.contains(s))
                 list.add(s);
        }
        for(int i = index ; i < c.length;i++){
            swap(c,index,i);
            dfs(c,index+1,list);
            //为保证有序的交换、交换的元素必须又交换回去
            swap(c,index,i);
        }
        
    }
    private static void swap(char[] c,int x,int y){
        if(x != y){
            char temp = c[x];
            c[x] = c[y];
            c[y] = temp;
        }
    }
}
