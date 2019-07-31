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
    public boolean isValidBST(TreeNode root) {
        return _isValidBST(root,null,null);
    }
    private static boolean _isValidBST(TreeNode root,Integer begin,Integer end){
        if(root == null) {
            return true;
        }
        //判断root.val是否在【begin，end】之间、如果不在这区间之间 返回false
        if(begin != null && root.val <= begin){
            return false;
        }
        if(end != null && root.val >= end){
            return false;
        }
        //到达这里证明 根结点合法，接下来去判断左右子树
        if(!_isValidBST(root.left,begin,root.val)){
            return false;
        }
        if(!_isValidBST(root.right,root.val,end)){
            return false;
        }
        return true;
    }
}
