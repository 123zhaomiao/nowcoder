import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char []sw = new char[130];//空格的ASCII为129
        String mima = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String yuanmima = "VWXYZABCDEFGHIJKLMNOPQRSTU";
        for(int i=0 ;i < mima.length();i++){
            sw[mima.charAt(i)] = yuanmima.charAt(i);
        }
        while(sc.hasNext()){
            String str = sc.nextLine();
            for(int i = 0; i < str.length();i++){
                char c = str.charAt(i);
                if(sw[c]!=0){
                     System.out.print(sw[c]);
                }else{
                      System.out.print(c);
                }
            }
            System.out.println();
        }
    }
}
