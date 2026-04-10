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
    
    public int goodNodes(TreeNode root) {

        return dfs(root,root.val);
        

    }
    public int dfs(TreeNode root,int max){
        if(root==null) return 0;
        int count=0;
        
        if(root.val>=max){
            max=root.val;
            count=1;
        }
        // System.out.print(root.val+" ");
        // if(root.left!=null && root.left.val>=max)res++;
        // if(root.right!=null&&root.right.val>=max)res++;
    
        // // if(root.val>=max){
        // //     res++;
        // //     max=root.val;
        // //     System.out.print("\nRootval"+root.val+"\n");
        // // }
        
        count+=dfs(root.left,max);
        count+=dfs(root.right,max);
        return count;
    }

}