
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int []grade = new int[n+1];
        for(int i =1;i< n+1;i++){
            grade[i] = scanner.nextInt();
        }
        while(m != 0){
            String s = scanner.next();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if(s.equals("Q")){
                int max = 0;
                if(a <= b){
                    for(int i = a ;i <= b;i++){
                        if(grade[i] > max){
                            max = grade[i];
                        }
                    }
                    System.out.println(max);
                }else{
                    for(int i = b ;i <= a;i++){
                        if(grade[i] > max){
                            max = grade[i];
                        }
                    }
                    System.out.println(max);
                }
            }else{
                grade[a] = b;
            }
            m--;
        }
    }
}
