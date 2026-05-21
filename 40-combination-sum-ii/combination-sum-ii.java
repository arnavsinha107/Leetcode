class Solution {
    List<List<Integer>> res=new ArrayList<List<Integer>>();
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> curr=new ArrayList<>();
        Arrays.sort(candidates);
        dfs(candidates,target,0,curr);
        return res;
    }
    public void dfs(int[] arr,int target,int i,List<Integer> curr){
        if(target==0){
            res.add(new ArrayList<>(curr));
            return;
        }
        else if(target<=0 || i>=arr.length){
            return;
        }
        curr.add(arr[i]);
        dfs(arr,target-arr[i],i+1,curr);
        curr.remove(curr.size()-1);
        while(i+1<arr.length && arr[i+1]==arr[i]){
            i++;
        }
        dfs(arr,target,i+1,curr);
    }
}