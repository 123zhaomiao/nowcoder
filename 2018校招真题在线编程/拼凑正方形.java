import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //排序:---a-----b-----c-----d---
        //设最优解为x，通过分析x在数轴上的位置可以得到上面的结论：
        //若x位于[a, b)，如---a--x--b-----c-----d---      a<=x<=d时，不管x处于a和d之间的哪个点上，x与a、d的距离之和总是不变的且等于d-a，所以最终影响结果的是x与b、c之间的距离。
        //若x位于[b, c]，如---a-----b--x--c-----d---      b<=x<=c时，不管x处于b和c之间的哪个点上(甚至与b或c重合)，x与b、c的距离之和总是不变的且等于c-b
        //若x位于(c, d]，如---a----b-----c--x--d---       而当x位于[a, b)或(c, d]时，都会使x到b、c的距离增大，从而使最终结果也增大。
        //我们可以得出结论需要支付最少的硬币为(d-a) + (c-b)
        int []m = new int[4];
        for(int i = 0 ; i < 4 ; i++){
            m[i] = scanner.nextInt();
        }
        Arrays.sort(m);
        System.out.println(m[3]-m[0]+m[2]-m[1]);
    }
}
