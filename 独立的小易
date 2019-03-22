/**
  * 小易为了向他的父母表现他已经长大独立了,他决定搬出去自己居住一段时间。
  * 一个人生活增加了许多花费: 小易每天必须吃一个水果并且需要每天支付x元的房屋租金。
  * 当前小易手中已经有f个水果和d元钱,小易也能去商店购买一些水果,商店每个水果售卖p元。
  * 小易为了表现他独立生活的能力,希望能独立生活的时间越长越好,
  * 小易希望你来帮他计算一下他最多能独立生活多少天。
  */
 package 独立的小易;

  import java.util.Scanner;

  public class Main {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         //输入每天的租金
         int x = scanner.nextInt();
         //输入已有水果
         int f = scanner.nextInt();
         //输入已有钱
         int d = scanner.nextInt();
         //输入水果售价
         int p = scanner.nextInt();
         System.out.println(liveDay(x,f,d,p));
     }
     public static int liveDay(int x,int f,int d,int p){
        //如果d足够支付f天的租金
         if(d-x*f>0){
             return f+(d-f*x)/(x+p);
         }else{
             //如果d不够支付
             return d/x;
         }
     }
 }
