/**
 * 小易有一些彩色的砖块。每种颜色由一个大写字母表示。
 * 各个颜色砖块看起来都完全一样。
 * 现在有一个给定的字符串s,s中每个字符代表小易的某个砖块的颜色。
 * 小易想把他所有的砖块排成一行。
 * 如果最多存在一对不同颜色的相邻砖块,那么这行砖块就很漂亮的。
 * 请你帮助小易计算有多少种方式将他所有砖块排成漂亮的一行。
 * (如果两种方式所对应的砖块颜色序列是相同的,那么认为这两种方式是一样的。)
 * 例如: s = "ABAB",那么小易有六种排列的结果:
 * "AABB","ABAB","ABBA","BAAB","BABA","BBAA"
 * 其中只有"AABB"和"BBAA"满足最多只有一对不同颜色的相邻砖块。
 *
 *
 * 输入包括一个字符串s,字符串s的长度length(1 ≤ length ≤ 50),
 * s中的每一个字符都为一个大写字母(A到Z)。
 */
package 彩色的砖块;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1.从键盘获取输入
        Scanner scanner = new Scanner(System.in);
        //2.输入字符串
        String s = new String();
        if(scanner.hasNext()){
            s = scanner.next();
        }
        //3.String-->char数组
        char [] arr = s.toCharArray();
        System.out.println(ColorBrick(arr));
    }
    public static int ColorBrick(char[] arr){
        //4.将砖块的颜色排序
        Arrays.sort(arr);
        //5.砖块总共的颜色数
        int count = 1;
        for(int i = 0 ; i < arr.length-1 ;i++){
            int k = arr[i];
            if(arr[i+1]!=k){
                count++;
            }
        }
        //如果有大于两种的颜色 肯定不是好看的排序 返回0
        if(count > 2){
            return 0;
        }
        //如果这些砖块只有一个颜色默认是好看的
        if(count == 1){
            return 1;
        }
        //如果有两种颜色，则好看的排序有两种AB或者BA
        return 2;
    }
}
