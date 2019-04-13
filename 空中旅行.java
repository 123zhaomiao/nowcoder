
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int []f = new int[n];
        for(int i = 0; i < n ;i++){
            f[i] = scanner.nextInt();
        }
        int sum = 0;
        int i = 0;
        for(i = 0; i < n ;i++){
            sum += f[i];
            if(sum > m){
                break;
            }
        }
        System.out.println(i);
    }
}
