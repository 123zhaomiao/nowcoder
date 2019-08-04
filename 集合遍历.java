import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();    // 颜色的种类数
        int n = sc.nextInt();    // 盒子中的小球数
        int[] nums = new int[k];    // 每种颜色的小球个数
        for(int i = 0; i < nums.length; i++)
            nums[i] = sc.nextInt();
         
        List<String> list = new ArrayList<>();
        solution(nums, list,0, n, "");
        
        for(int i =  list.size()-1 ; i >= 0;i--){
            System.out.println(list.get(i));
        }
    }
    private static void solution(int[] nums,List<String> list, 
                                   int index,int n, String s){
        if(index == nums.length){
            if(n == 0){
                list.add(s);
            }
            return;
        }
        for(int i = Math.min(nums[index],n); i >= 0 ; i--){
            solution(nums,list,index+1,n-i,s+i);
        }
    }
}
