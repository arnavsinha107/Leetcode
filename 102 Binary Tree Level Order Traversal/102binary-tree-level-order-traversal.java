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
    List<List<Integer>> ans;
    public List<List<Integer>> levelOrder(TreeNode root) {
        ans=new ArrayList<>();
        bfs(root);
        return ans;
    }
    public void bfs(TreeNode root){
        if(root==null)return;
        
        Queue<TreeNode> q=new LinkedList<>();
        //Queue<TreeNode> q2=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> list=new ArrayList<>();
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                list.add(node.val);
                //System.out.print(node.val+" ");
                if(node.left!=null)q.add(node.left);
                if(node.right!=null)q.add(node.right);
                
            }
            ans.add(list);
            
        }
    }
}