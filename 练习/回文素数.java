import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int left = scanner.nextInt();
        int right = scanner.nextInt();
        System.out.println(count(left,right));
    }
    private static int count(int left,int right){
        int count = 0;
        for(int i = left; i <= right;i++){
            if(prime(i) && rev(i)){
                count++;
            }
        }
        return count;
    }
    private static boolean prime(int num){
        if( num == 1){return false;}
        for(int i = 2 ; i <= Math.sqrt(num) ; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    
    private static boolean rev(int num){
        String str = String.valueOf(num);
        int left = 0;
        int right = str.length()-1;
        while(left < right){
            if(str.charAt(left)!= str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}
