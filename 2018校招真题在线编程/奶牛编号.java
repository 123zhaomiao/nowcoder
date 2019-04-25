import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []x = new int[n];
        for(int i = 0 ; i < n; i++){
            x[i] = scanner.nextInt();
        }
        System.out.println(sum(n,x));
    }
    private static long sum(int n,int[] x){
        Arrays.sort(x);
        long sum = 1;
        for(int i = 0 ; i < n ; i++){
            sum = ( sum *(x[i] - i) ) %1000000007;
        }
        return sum;
    }
}
