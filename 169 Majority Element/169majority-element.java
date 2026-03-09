class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int max=0;
        int curr=1;
        int ans=0;
        if(nums.length==1) return nums[0];

        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]) curr++;
            else curr=1;
            if(curr>max){
                max=curr;
                ans=nums[i];
            }
        }
        return ans;
    }
}