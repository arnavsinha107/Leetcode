class Solution {
    public boolean canPartition(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        //int[] dp=new int[n+1];
        int temp=0;
        for(int i=0;i<n;i++){
            temp+=nums[i];
        }
        if(temp%2!=0)return false;
        int target=temp/2;
        boolean[][] dp=new boolean[n+1][target+1];
        for(int i=0;i<=n;i++){
            dp[i][0]=true;

        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=target;j++){
                if(j<nums[i-1]){
                    dp[i][j]=dp[i-1][j];
                }
                else{
                    dp[i][j]=dp[i-1][j] || dp[i-1][j-nums[i-1]];
                }
            }
        }
        return dp[n][target];
        
    }
    
}



        // HashSet<Integer> dp=new HashSet<>();
        // dp.add(0);
        // for(int i=n-1;i>=0;i--){
        //     HashSet<Integer> tempset=new HashSet<>();
        //     for(int j:dp){
        //         if(j+nums[i]==target)return true;
        //         tempset.add(j+nums[i]);
        //         tempset.add(j);
        //     }
        //     dp=tempset;
        // }
        // if(dp.contains(target))return true;
        // else return false;
        