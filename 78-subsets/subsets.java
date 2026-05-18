class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        //ans.add(new ArrayList<>());
        build(nums,0,new ArrayList<>());
        return ans;
    }
    public void build(int[] nums,int k,List<Integer> curr){
        if(k==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[k]);
        build(nums,k+1,curr);
        curr.remove(curr.size()-1);
        build(nums,k+1,curr);

    }
}