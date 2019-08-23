import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []x = new int[n];
        for(int i = 0 ; i < n;i++){
            x[i] = scanner.nextInt();
        }
        System.out.println(solution(x));
    }
    private static int solution(int []x){
        for(int i = 0; i < x.length;i++){
            x[i] = rev(x[i]);
        }
        Arrays.sort(x);
        return x[x.length-1];
    }
    private static int rev(int num){
        String s = String.valueOf(num);
        char c[] = s.toCharArray();
        Arrays.sort(c);
        StringBuffer str = new StringBuffer();
        for(int i = 0; i < c.length ; i++){
            str.append(c[i]);
        }
        return Integer.valueOf(str.toString());
        //ArrayList<Integer> list = new ArrayList<>();
       //while(num!=0){
           // list.add(num%10);
           // num /= 10;
       //}
        //Collections.sort(list);
        //StringBuffer str = new StringBuffer();
        //for(int i = 0; i < list.size() ; i++){
            //str.append(list.get(i));
        //}
        //return Integer.valueOf(str.toString());
    }
}
