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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null || root==p || root==q)return root;
        TreeNode left=lowestCommonAncestor(root.left,p,q);
        TreeNode right=lowestCommonAncestor(root.right,p,q);
        if(left!=null &&right!=null)return root;
        return left!=null?left:right;
    }

}

// unoptimal dfs approach
// class Solution {
//     public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//         while(contains(root,p) && contains(root,q)){
//             // System.out.print(contains(root,p));
//             // System.out.print(contains(root,q));
//             // System.out.print("\n");
//             if(contains(root.left,p)&& contains(root.left,q)){
//                 root=root.left;
//             }
//             else if(contains(root.right,p)&& contains(root.right,q)){
//                 root=root.right;
//             }
//             else{
//                 break;
//             }
//         }
//         return root;
        
//     }
//     public boolean contains(TreeNode root,TreeNode p){
//         if(root==null)return false;
//         if(root==p)return true;
//         if((root.left== p)){
//             return true;
//         }
//         else if((root.right== p) ){
//             return true;
//         }
//         else{
//             return contains(root.left,p) || contains(root.right,p);
//         }
//     }
// }