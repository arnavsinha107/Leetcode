class Solution {
    public int minCostClimbingStairs(int[] cost) {
        //int sum=0;
        int n=cost.length;
        //int[] dp=new int[n];
        //dp[n-1]=0;
        for(int i=n-3;i>=0;i--){
            cost[i]=cost[i]+Math.min(cost[i+1],cost[i+2]);
        }
        return Math.min(cost[0],cost[1]);
    }
}