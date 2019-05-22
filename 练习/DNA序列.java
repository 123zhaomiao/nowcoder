import java.util.Scanner;
import java.util.HashSet;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        for(int i = 1 ; i <= str.length(); i++){
            HashSet<String> set = new HashSet<String>();
            for(int j = 0 ; j < str.length() - i;j++){
                set.add(str.substring(j,j+i));
            }
            if(set.size() < Math.pow(4,i)){
                System.out.println(i);
                break;
            }
        }
    }
}
