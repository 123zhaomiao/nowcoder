class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int all = nums[0];
        int end = nums[0];
        
        for(int i = 1;i < n;i++){
           end = Math.max(end+nums[i],nums[i]);
           all = Math.max(all,end);
        }
        return all;
    }
}
