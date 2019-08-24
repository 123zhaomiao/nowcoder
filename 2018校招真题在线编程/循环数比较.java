import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int k1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int k2 = scanner.nextInt();
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        for(int i = 0 ;i < k1 ;i++){
            str1.append(x1);
        }
        for(int i = 0 ;i < k2 ;i++){
            str2.append(x2);
        }
        
        String s1 = str1.toString();
        String s2 = str2.toString();
        if(s1.length() > s2.length()){
            System.out.println("Greater");
        }else if(s1.length() < s2.length() ){
            System.out.println("Less");
        }else{
            for(int i = 0 ;i < s1.length() ; i++){
                char c1 = s1.charAt(i);
                char c2 = s2.charAt(i);
                if(c1 > c2){
                    System.out.println("Greater");
                    return;
                }else if(c1 < c2){
                    System.out.println("Less");
                    return;
                }
            }
            System.out.println("Equal");
        }
    }
}
