import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            int n = sc.nextInt();
            int [] arr = new int [n];
            //计算能被4整除的数
            int count  = 0 ;
            int count1 = 0 ;
            for(int i = 0 ; i < n ;i++){
                arr[i] = sc.nextInt();
                if(arr[i] % 4 == 0){
                    count++;
                }else if( arr[i] % 2 == 0)
                    count1++;
            }
            if(count >= n/2 || count >= (n-count1)/2){
                System.out.println("Yes");
            }else{
               System.out.println("No");
            }
            t--;
        }
    }
    
}
