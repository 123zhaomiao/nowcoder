import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s  =  scanner.nextLine();
        System.out.println(depth(s));
    }
    private static int depth(String s){
        
        int dep = 0;
        int max = 0;
        for(int i = 0 ; i < s.length(); i++){
            char c = s.charAt(i);
            if( c == '('){
                dep++;
                if(dep > max){
                    max = dep;
                }
            }else{
                dep--;
            }
        }
        return max;
    }
}
