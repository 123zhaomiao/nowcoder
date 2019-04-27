import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[]s = str.split(" ");
        for(int i = s.length-1; i >= 0; i--){
            if( i !=0 ){
                System.out.print(s[i]+" ");
            }else{
                System.out.print(s[i]);
            }
        }
    }
}
