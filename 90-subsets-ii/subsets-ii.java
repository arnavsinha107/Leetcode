class Solution {
    List<List<Integer>> ans=new ArrayList<List<Integer>>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        build(nums,0,new ArrayList<>());
        return new ArrayList<>(ans);
    }
    public void build(int[] nums,int k,List<Integer> curr){
        if(k==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[k]);
        build(nums,k+1,curr);
        curr.remove(curr.size()-1);
        while(k+1<nums.length && nums[k+1]==nums[k]){
            k++;
        }
        build(nums,k+1,curr);

    }
}