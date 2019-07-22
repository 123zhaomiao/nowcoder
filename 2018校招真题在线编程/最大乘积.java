import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long []A = new long[n];
        for(int i = 0 ; i < n ; i++){
            A[i] = scanner.nextLong();
        }
        Arrays.sort(A);      
        if(A[0] > 0 ){
            System.out.println(A[n-1]* A[n-2]* A[n-3]);
        }else{
            System.out.println(Math.max(A[n-1]* A[n-2]* A[n-3],A[0]*A[1]*A[n-1]));
        }
        
    }
}
