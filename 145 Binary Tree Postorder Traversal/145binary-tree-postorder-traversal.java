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
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> res=new ArrayList<>();
        postorder(root,res);
        for(int i=0;i<999999;i++){
            
        }
        return res;
        
    }
    void postorder(TreeNode node,ArrayList res){
        if(node==null) return;
        postorder(node.left,res);
        
        postorder(node.right,res);
        res.add(node.val);
    }
}