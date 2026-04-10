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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list=inorderTraversal(root);
        return list.get(k-1);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> res=new ArrayList<>();
        inorder(root,res);
        //System.out.print( res);
        return res;
    }
    void inorder(TreeNode node,ArrayList res){
        if(node==null){
            return;

        }
        
        inorder(node.left,res);
        res.add(node.val);
        inorder(node.right,res);
    }
}