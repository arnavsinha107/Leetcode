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
    List<List<Integer>> ans=new ArrayList<>();

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        bfs(root,0);
        return ans;
    }
    public void bfs(TreeNode root,int a){
        if(root==null)return;
       
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> list=new ArrayList<>();
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                list.add(node.val);
                if(node.left!=null)q.add(node.left);
                if(node.right!=null)q.add(node.right);
                // if(a%2!=0){
                //     if(node.left!=null)q.add(node.left);
                //     if(node.right!=null)q.add(node.right);
                // }
                // else{
                //     if(node.right!=null)q.add(node.right);
                //     if(node.left!=null)q.add(node.left);
                // }
                
            }
            if(a%2!=0){
                Collections.reverse(list);
            }
            a++;
            ans.add(list);
            
        }
        
    }
}