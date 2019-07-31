、/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        return _isValidBST(root,null,null);
    }
    private static boolean _isValidBST(TreeNode root,Integer begin,Integer end){
        if(root == null) {
            return true;
        }
        //判断root
