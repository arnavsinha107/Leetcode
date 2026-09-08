class Solution {
    int[][] dp;
    public int change(int amount, int[] coins) {
        dp=new int[coins.length][amount+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        
        return solve(amount,coins,0,0);
    }
    public int solve(int amount,int[] coins, int i, int curr){
        
        if(i>=coins.length)return 0;       
        //System.out.println(coins[i]+" "+i+" "+curr);
        if(curr==amount){
            return 1;
        }
        if(curr>amount)return 0;
        if(dp[i][curr]!=-1)return dp[i][curr];
        int take=solve(amount,coins,i,curr+coins[i]);
        int skip=solve(amount,coins,i+1,curr);
        return dp[i][curr]=take+skip;
    }
}