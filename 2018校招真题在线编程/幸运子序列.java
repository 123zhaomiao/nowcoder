import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n  = scanner.nextInt();
        int[] v = new int[n];
        for(int i = 0 ; i < n;i++){
            v[i] = scanner.nextInt();
        }
        //将v[i]看成是次大值 向前向后找比V[i]大的值做异或
        for(int i = 0 ; i < n ; i++){
            //向前找比V[i]大的值
            int leftmax = v[i];
            int j = 0;
            for(j = i-1 ; j >= 0; j--){
                if(v[j] > leftmax){
                    leftmax = v[j];
                    break;
                }
            }
            int left = 0;
            if(j >= 0){
                left = v[i] ^ leftmax;
            }
            //
            //向前找比V[i]大的值
            int rightmax = v[i];
            int z = 0;
            for(z = i+1 ; z < n; z++){
                if(v[z] > rightmax){
                    rightmax = v[z];
                    break;
                }
            }
            int right = 0;
            if(z < n){
                right = v[i] ^ rightmax;
            }
            list.add(right > left ? right:left);
        }
        Collections.sort(list);
        System.out.println(list.get(list.size()-1));
    }
}
