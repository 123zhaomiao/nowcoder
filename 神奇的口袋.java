
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for(int i = 0;i< n ;i++){
            a[i] = scanner.nextInt();
        }
        System.out.println(solution(0,40,n,a));
    }
    private static int solution(int i,int sum,int n,int[]a){
        if(sum == 0) return 1;
        if(i==n || sum < 0) return 0;
        return solution(i+1,sum-a[i],n,a)+solution(i+1,sum,n,a);
    }
}
