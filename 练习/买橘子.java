import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner  = new Scanner(System.in);
        //1.输入小明想要购买的橙子数
        int n  = scanner.nextInt();
        for(int i = 0; i <= n/6;i++){
            for(int j = 0;j <= n/8;j++){
                if(6*i+8*j == n){
                    System.out.println(i+j);
                    return;
                }
            }
        }
        System.out.println(-1);
    }
}
