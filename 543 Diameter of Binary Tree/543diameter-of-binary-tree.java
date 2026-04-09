/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int d=0;
    public int diameterOfBinaryTree(TreeNode root) {
        subHeight(root);
        return d;
    }
    public int subHeight(TreeNode root){
        if(root==null)return 0;
        int left=subHeight(root.left);
        int right=subHeight(root.right);
        d=Math.max(d,left+right);
        return Math.max(left+1,right+1);
    }
}