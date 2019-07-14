 import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            String str = String.valueOf(n);
            StringBuffer s = new StringBuffer(str);
            s.reverse();
            Integer num = Integer.parseInt(s.toString());
            System.out.println(n+num);
        }
    }
}
