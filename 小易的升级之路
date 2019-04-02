import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
             //1.输入怪物的数量
        int n = scanner.nextInt();
        //2.输入小易的初始能力值
        int a =  scanner.nextInt();
        //3.怪物的防御能力
        int []b = new int[n];
        for(int i = 0; i<n;i++){
            b[i] = scanner.nextInt();
        }
        //4.输出最终的能量值
        int result  = operate(b,n,a);
        System.out.println(result);
        }
    }
    private static int operate(int[]b,int n,int a){
        int result = a;
        for(int i = 0; i < n ;i++){
            if(b[i] < result){
                result += b[i];
            }else{
                result += divisor(b[i],result);
            }
        }
        return result;
    }
    //计算最小公约数
    private static int divisor(int a,int b){
        int c = a%b;
        while(c!=0){
            a = b;
            b = c;
            c = a%b;
        }
        return b;
    }
}
