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
        HashSet<Integer> dp=new HashSet<>();
        dp.add(0);
        for(int i=n-1;i>=0;i--){
            HashSet<Integer> tempset=new HashSet<>();
            for(int j:dp){
                if(j+nums[i]==target)return true;
                tempset.add(j+nums[i]);
                tempset.add(j);
            }
            dp=tempset;
        }
        if(dp.contains(target))return true;
        else return false;
        
    }
    
}