/**
 *如果一个01串任意两个相邻位置的字符都是不一样的,我们就叫这个01串为交错01串。
 * 例如: "1","10101","0101010"都是交错01串。
 * 小易现在有一个01串s,小易想找出一个最长的连续子串,并且这个子串是一个交错01串。
 * 小易需要你帮帮忙求出最长的这样的子串的长度是多少。
 *
 * 输入包括字符串s,s的长度length(1 ≤ length ≤ 50),字符串中只包含'0'和'1'
 */
package 交错01串;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.输入一串字符串
        String s = scanner.next();
        //2.将字符串转为字节数组
        byte[] x= s.getBytes();
        System.out.println(Max_child(x));
    }
    public static int Max_child(byte[] x){
        int i =0;
        //3.最大子串长度
        int count = 0;
        for(i =0 ; i<x.length-1 ;i++){
            //4.k值用于记录前一个count值
            int k = count;
            count = 0;
            //5.如果遇到前后数字不一样的情况 计数器+1
            while(i<(x.length-1)&&x[i+1] != x[i]){
                count++;
                i++;
            }
            //6.当前count和之前的count比较 将较大值赋给count
            count = count>k?count:k;
        }
        return count+1;
    }
}
