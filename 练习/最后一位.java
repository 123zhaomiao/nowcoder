import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long in = sc.nextLong();
        System.out.println(niuBinarySearch(in, 0, in));
    }
 
    private static long getNiuSum(long num) {
        long ans = 0;
        while (num != 0) {
            ans += num;
            num /= 10;
        }
        return ans;
    }
    //运用二分查找法
    private static long niuBinarySearch(long target, long fromIndex, long toIndex) {
        while (fromIndex < toIndex) {
            //mid = (fromIndex + toIndex)/2
            long mid = (fromIndex + toIndex) >> 1;
            long midNiuSum = getNiuSum(mid);
            if (midNiuSum == target) {
                return mid;
            } else if (target > midNiuSum) {
                fromIndex = mid+1;
            } else if (target < midNiuSum) {
                toIndex = mid ;
            }
        }
        return -1;
    }
}
