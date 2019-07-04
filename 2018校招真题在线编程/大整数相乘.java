/**
  * 有两个用字符串表示的非常大的大整数,算出他们的乘积，也是用字符串表示。
  * 不能用系统自带的大整数类型。
  */
 package 大整数相乘;
 import java.util.Scanner;
  public class Main{
     public static void main(String[] args){
         //获取输入
         Scanner scanner = new Scanner(System.in);
         //输入由空格分隔的两个字符串
         String str1 = scanner.next();
         String str2 = scanner.next();
         //翻转两个字符串并将其转为字符数组
         char[] arr1 = str1.toCharArray();
         char[] arr2 = str2.toCharArray();
         System.out.println(LargeNumberMul(arr1,arr2));
       
     }
     public static String LargeNumberMul(char[] arr1,char[] arr2){
         StringBuffer stringBuffer = new StringBuffer();

          //1.首先将两个字符串转为整形顺便翻转
         int[] a1 = new int[arr1.length];
         int k = 0;
         for(int i = arr1.length-1;i>=0;i--){
             a1[k] = (arr1[i]-'0');
             k++;
         }
         int[] a2 = new int[arr2.length];
         k=0;
         for(int i = arr2.length-1;i>=0;i--){
             a2[k] = (arr2[i]-'0');
             k++;
         }
         int[]result = new int[arr1.length+arr2.length];

          //2.大整数相乘
         for(int i = 0 ; i < a1.length;i++) {
             for (int j = 0; j < a2.length; j++) {
                 int temp = result[i + j] + (a1[i] * a2[j]);
                 result[i + j] = (temp) % 10;
                 result[i + j + 1] = result[i + j + 1] + (temp) / 10;
             }
         }

          //3.翻转
         for(int i = result.length-1;i>=0;i--){
             if(i == result.length-1){
                 if(result[i]!=0){
                     stringBuffer.append(result[i]);
                 }
             }else{
                 stringBuffer.append(result[i]);
             }
         }
         return stringBuffer.toString();
     }
 } 
