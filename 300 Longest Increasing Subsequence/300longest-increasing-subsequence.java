class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
        for(int i=0;i<n;i++){
            dp[i]=1;
        }
        for(int i=1;i<n;i++){
            for(int prev=0;prev<i;prev++){
                if(nums[i]>nums[prev]){
                    dp[i]=Math.max(dp[i],dp[prev]+1);
                }
            }
        }
        int max=0;
        for(int i:dp ){
            if(max<i){
                max=i;
            }
        }
        return max;
    }
}