class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int max=0;
            while(i<nums.length && nums[i]==1){
                max++;
                i++;

            }
            if(max>ans){
                ans=max;
            }
        }
        return ans;
    }
}