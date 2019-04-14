import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []a = new int[n];
        for(int i = 0;i < n ; i++){
            a[i] = scanner.nextInt();
        }
        System.out.println(solution(a));
    }
    private static int solution(int []arr){
        int count = 1;
        for(int i = 0; i < arr.length-1;i++){
            while(i<arr.length-1 && arr[i+1]-arr[i] != 1){
                count++;
                i++;
            }
        }
        return count;
    }
}
