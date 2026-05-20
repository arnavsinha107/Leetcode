class Solution {
    List<List<Integer>> res=new ArrayList<List<Integer>>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> curr=new ArrayList<>();
        backtracking(candidates,target,curr,0);
        return res;
    }
    public void backtracking(int[] arr,int target,List<Integer> curr,int index){
        if(target==0){
            res.add(new ArrayList<>(curr));
            return;
        }
        if(target<=0|| index>=arr.length){
            return;
        }
        curr.add(arr[index]);
        backtracking(arr,target-arr[index],curr,index);
        curr.remove(curr.size()-1);
        backtracking(arr,target,curr,index+1);
    }
}