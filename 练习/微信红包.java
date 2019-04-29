import java.util.*;
public class Gift {
    public int getValue(int[] gifts, int n) {
        Arrays.sort(gifts);
        int half = n/2;
        int count = 0;
        for(int i = 0; i < n-1;i++){
            count = 1;
            while(i < n-1 && gifts[i] == gifts[i+1]){
                i++;
                count++;
            }
            if(count > half){
                return gifts[i];
            }
        }
        return 0;
    }
}
