import java.util.Scanner;
public class Main{
    public static void main(String[] args){  
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder str = new StringBuilder();
        while(n != 0){
            if(n % 2 == 0){
                str.append(2);
                n = (n-2)/2;
            }else{
                str.append(1);
                n = (n-1)/2;
            }
        }
        str.reverse();
        System.out.println(str.toString());
    }
}
