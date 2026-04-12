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
    List<List<Integer>> arr=new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        bfs(root);
        List<Integer> ans=new ArrayList<>();
        //System.out.print(arr);
        for(List<Integer> i:arr){
            int n=i.size();
            //System.out.print(i.size());
            //System.out.print(i.get(n-1));
            int a=i.get(n-1);
            ans.add(a);
            //System.out.print("\n");
        }
        return ans;
    }
    public void bfs(TreeNode root){
        if(root==null) return;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> lvl=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                lvl.add(node.val);
                if(node.left!=null)q.add(node.left);
                if(node.right!=null)q.add(node.right);
            }
            arr.add(lvl);
        }
    }
}