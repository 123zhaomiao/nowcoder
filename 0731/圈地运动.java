import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n;i++){
            arr[i] = sc.nextInt();
        }
        
         System.out.println(checkOk(arr,n));
    }
    private static int checkOk(int [] arr,int n){
        int count = -1;
        if(n < 3){
            return -1;
        }
        int sum = arr[0] + arr[1];
        int max = (int)Math.max(arr[0],arr[1]);
        for(int i = 2; i < n;i++){
            sum += arr[i];
            max = (int)Math.max(max,arr[i]);
            if(sum - max > max){
                count = i+1;
                break;
            }
        }
        return count;
    }
}
