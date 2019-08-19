/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return solution(nums,0,nums.length-1);
    }   
    
    private static TreeNode solution(int[] nums,int begin,int end){
        if(begin > end){
            return null;
        }
        
        int mid = (begin + end)/2;
        TreeNode root = new TreeNode(nums[mid]);
        if(begin < mid){
            root.left = solution(nums,begin,mid-1);
        }
        if(end > mid){
            root.right = solution(nums,mid+1,end);
        }
        
        return root;
    }
}
