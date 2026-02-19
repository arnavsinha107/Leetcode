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
    public int sumNumbers(TreeNode root) {
        int res=0;
        res=preorder(root,res);
        return res;



    }
    int preorder(TreeNode node,int res){
        if(node==null) return 0;
        res=res*10+node.val;
        if(node.left==null&&node.right==null){
            return res;
        }
        return preorder(node.left,res)+preorder(node.right,res);

    }
}