import java.util.Scanner;
import java.text.DecimalFormat;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        //判断有多少个交界处
        for(int i = 0; i < s.length();i++){
            while(i < s.length()-1 && s.charAt(i) == s.charAt(i+1)){
                i++;
            }
            count++;
        }
         DecimalFormat df = new DecimalFormat("#.00");
         System.out.println(df.format(s.length()/(double)count));
    }
}
