class Solution {
    int[][] dp;
    public int findTargetSumWays(int[] nums, int target) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];

        }
        if(target>sum || target < -sum)return 0;
        dp=new int[nums.length][2*sum+1];
        for(int i=0;i<nums.length;i++) {
            Arrays.fill(dp[i],-1);
        }
        return solve(nums,target,0,sum);
    }
    public int solve(int[] nums,int target,int i,int sum){
        if(i>=nums.length)return target==0?1:0;
        if(target > sum || target < -sum)return 0;
        if(dp[i][target+sum]!=-1){
            return dp[i][target+sum];
        }
        int add=solve(nums,target-nums[i],i+1,sum);
        int subtract=solve(nums,target+nums[i],i+1,sum);
        return dp[i][target+sum]=add+subtract;

    }
}