/**
 * 小易有一个长度为n的整数序列,a_1,...,a_n。然后考虑在一个空序列b上进行n次以下操作:
 * 1、将a_i放入b序列的末尾
 * 2、逆置b序列
 * 小易需要你计算输出操作n次之后的b序列。
 * 输入包括两行,第一行包括一个整数n(2 ≤ n ≤ 2*10^5),即序列的长度。
 * 第二行包括n个整数a_i(1 ≤ a_i ≤ 10^9),即序列a中的每个整数,以空格分割。
 */

/**
 * 此题禁忌被逆序迷惑 其实只是间隔一个输出而已
 * 例如 ：1 2 3 4  输出 4 2 1 3
 * 例如：1 2 3 4 5 输出5 3 1 2 4
 * 例如：10 28 43 21 1输出1 43 10 28 21
 */
package 操作序列;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //输入语句
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []a = new int[n];
        int []b = new int[n];
        for(int i = 0;i < n ; i++){
            a[i] = scanner.nextInt();
        }
        //调用函数
        b = OperateSequence(a,b);
        //输出语句
        int i=0;
        for(i = 0;i< n-1; i++){
            System.out.print(b[i]+" ");
        }
        System.out.println(b[i]);
    }
    public static int[] OperateSequence(int []a,int[]b){
        /**
         * 假设数组长度为偶数
         * 数组从后先前赋值到下标为1截止 然后从下标为0开始赋值
         * 假设数组长度为奇数
         * 数组从后向前赋值到下标为0截止，然后从下标为1开始赋值
         */
        if(a.length%2==0){
            int j = 0;
            for(int i = a.length-1; i >=0 ;i-=2){
                b[j] = a[i];
                j++;
            }
            for(int i = 0;i < a.length-1;i+=2){
                b[j] = a[i];
                j++;
            }
        }else{
            int j = 0;
            for(int i = a.length-1; i >=0 ;i-=2){
                b[j] = a[i];
                j++;
            }
            for(int i = 1;i < a.length-1;i+=2){
                b[j] = a[i];
                j++;
            }
        }
        return b;
    }
}
