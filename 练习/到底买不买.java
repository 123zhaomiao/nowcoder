import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String boss = sc.nextLine();
            String customer = sc.nextLine();
            contain(boss,customer);
        }
    }
    private static void contain(String boss,String customer){
        int less = 0;
        for(int i = 0 ; i < customer.length();i++){
            if(!boss.contains(customer.charAt(i)+"")){
                less++;
                continue;
            }
            boss = boss.replaceFirst(customer.charAt(i)+"","*");
        }
        
        if(less == 0){
            System.out.println("Yes"+" "+(boss.length()-customer.length()));
        }else{
            System.out.println("No"+" "+less);
        }
       
    }
}
