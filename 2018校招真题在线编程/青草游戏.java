
import java.util.Scanner; 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i = 0;
        // 这是一道规律题
        // 0 -> yang
        // 1 -> niu
        // 2 -> yang
        // 3 -> niu
        // 4 -> niu
        // 5 -> yang
        // 6 -> niu
        // 7 -> yang
        // 8 -> niu
        // 9 -> niu
        while(i < t) {
            long n = sc.nextLong();
            if(n % 5 == 0 || n % 5 == 2)
                System.out.println("yang");
            else 
                System.out.println("niu");
            i++;
        }
    }
}
