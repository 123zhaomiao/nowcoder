import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        int [] x = new int[3];
        for(int i = 0; i < 3;i++){
            x[i] = scanner.nextInt();
        }
        
        Arrays.sort(x);
        //1.等腰三角形
        if(x[0] == x[1] && x[1] == x[2] && x[2] == x[0]){
            System.out.println(3*x[0]);
        }else if(x[0]+x[1] > x[2]){
            System.out.println(x[0]+x[1]+x[2]);
        }else {
            System.out.println(2*(x[0]+x[1])-1);
        }
    }
}
