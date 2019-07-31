import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long minx = Long.MAX_VALUE;
        long maxx = Long.MIN_VALUE;
        long miny = Long.MAX_VALUE;
        long maxy = Long.MIN_VALUE;
        for(int i = 0 ; i < n;i++){
            long x = sc.nextLong();
            long y = sc.nextLong();
             
            if(x < minx){
                minx = x;
            }
            if(x > maxx){
                maxx = x;
            }
            if(y < miny){
                miny = y;
            }
            if(y > maxy){
                maxy = y;
            }
        }
        long result = (long)Math.max(maxx-minx,maxy-miny);
        System.out.println(result*result);
    }
}
