import java.util.Arrays;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.从键盘获取一个整形值，作为小朋友的个数
        int n = scanner.nextInt();
        //创建数组h,里面有n个元素
        int[] h = new int[n];
        for(int i = 0;i<n;i++)
        {
            h[i]=scanner.nextInt();
        }
        //2.从键盘获取一个整形值，作为巧克力的个数
        int m = scanner.nextInt();
        //创建数组w,里面有m个元素
        int[] w = new int[m];
        for(int i = 0;i < m;i++)
        {
            w[i]=scanner.nextInt();
        }
        System.out.println(maxChildrenNumber(h,w));
    }
    public static int maxChildrenNumber(int[] h,int[]w){
        //3.对h数组进行排序
        Arrays.sort(h);
        //上台的孩子数量
        int count = 0;
        for(int i = 0;i < w.length ;i++){
            int j = 0;
            for(j = 0;j < h.length;j++){
                //4.遍历寻找w[i]的最佳适应位置 即当h[j]>w[i]时,将巧克力分给前一个孩子
                if(h[j] > w[i]){
                    break;
                }
            }
            
            //5.记录前一个孩子，并重新将h数组排序
            if(j!=0 && h[j-1]!=0 ){
                h[j-1] = 0;
                count++;
                Arrays.sort(h);
            }
        }
        return count;
    }
}
