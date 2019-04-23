import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long sum = scanner.nextLong();
        System.out.println(newBinarySearch(sum,0,sum));
    }
    //修改版的二分查找
    private static long newBinarySearch(long target,long left,long right){
        while(left <= right){
            long mid = (right+left)>>1;
            long sum = getSum(mid);
            if(sum == target){
                return mid;
            }else if(sum > target){
                right = mid - 1;
            }else{
                left = mid + 1; 
            }
        }
        return -1;
    }
    //求和
    private static long getSum(long mid){
        long sum = 0;
        while(mid != 0){
            sum += mid;
            mid /= 10;
        }
        return sum;
    }
}
