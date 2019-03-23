package 每日一练.day01.寻找第K大;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        int []a = new int[n];
        for(int i = 0; i<n;i++){
            a[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        System.out.println(findKth(a,n,k));
    }
    public static int findKth(int[] a, int n, int K) {
        return a[sort(a,0,n-1,K)];
    }
    public static int sort(int[]a ,int left,int right,int K){

        int pos = quickSort(a,left,right);

        int n = a.length -K;
        if(n > pos){
            return sort(a,pos+1,right,K);
        }else if(n == pos){

            return pos;
        }else{
            return sort(a,left,pos-1,K);
        }
    }
    public static int quickSort(int[] a,int begin,int end){
        //基准值
        int key = a[end];
        int k = end;
        while(begin != end){
            //begin找到比基准值大的元素停止
            while(a[begin] <= key && begin< end){
                begin++;
            }
            //end找到比基准值小的元素停止
            while(a[end] >= key && begin< end){
                end--;
            }
            //交换
            if(begin != end){
                int temp = a[begin];
               a[begin] =a[end];
               a[end] =temp;
            }
        }

        int temp = a[begin];
        a[begin] = a[k];
        a[k] = temp;
        return begin;
    }
}
