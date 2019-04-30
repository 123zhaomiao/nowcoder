import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int k = scanner.nextInt();
        char [] c = str.toCharArray();
        Arrays.sort(c);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < c.length-1;i++){
            int count = 1;
            while(i < c.length-1 && c[i] == c[i+1]){
                 count++;
                 i++;
            }
            list.add(count);
        }
        if(c[c.length - 1] != c[c.length-2]){
            list.add(1); 
        }
        //排序ArrayList 使得最后一个值-1
        for(int i = 0;i < k;i++){
            Collections.sort(list);
            list.set(list.size()-1,list.get(list.size()-1)-1);
        }
        //返回结果
        int sum = 0;
        for(int i = 0; i < list.size();i++){
            sum += Math.pow(list.get(i),2);
        }
        System.out.println(sum);
    }
}
