class Solution {
    public int maxSubArray(int[] nums) {
        //1.暴力法
        int max = nums[0];
        int sum = 0 ;
        for(int i = 0 ; i < nums.length;i++){
           if(sum > 0){
               sum += nums[i];
           }else{
               sum = nums[i];
           }
            max = Math.max(sum,max);
        }
        return max;
    }
}
