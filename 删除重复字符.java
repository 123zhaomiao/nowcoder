import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        HashSet<Character> set = new HashSet<>();
        for(int i = 0 ; i < str.length();i++){
            char c = str.charAt(i);
            if(!set.contains(c)){
                set.add(c);
                System.out.print(c);
            }
        }
    }
}
