import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] x = new int[n];
        int[] copyX = new int[n];
        for(int i = 0; i<n ;i++){
            x[i] = scanner.nextInt();
            copyX[i] = x[i];
        }
        int count = 0;
        Arrays.sort(x);
        for(int i = 0; i < n;i++){
            if(x[i] != copyX[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}
