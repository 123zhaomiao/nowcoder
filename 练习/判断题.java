import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        int a = scanner.nextInt();
        if(t > a){
            System.out.println(a + n - t);
        }else if(t < a){
            System.out.println(t + n - a);
        }else{
            System.out.println(n);
        }
    }
}
