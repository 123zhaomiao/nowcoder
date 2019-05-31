import java.util.Scanner;
import java.util.Stack;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        String s = scanner.nextLine();
        int count = 0;

        for(int i = 0; i < s.length() ;i++){
            char c = s.charAt(i);
            if(c == '('){
                stack.push(c);
            }else{
                if(!stack.isEmpty()){
                    stack.pop();
                }else{
                    count++;
                }
            }
        }
        System.out.println(stack.size()+count);
    }
}
