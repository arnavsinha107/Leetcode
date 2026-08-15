class Solution {
    public int alternatingSubarray(int[] nums) {
        
        int ans=0;
        int n=nums.length;
        
        int curr=0;
       
        for(int i=1;i<n;i++){
            
           int diff=nums[i]-nums[i-1];
           if(diff==1){
                if(curr==0 || curr%2==0){
                    curr++;
                }
                else{
                    curr=1;
                }
           }
           else if(diff==-1 && curr>0 && curr%2==1){
                curr++;
           }
           else{
                curr=0;
           }
           ans=Math.max(ans,curr);

        }
        return ans==0?-1:ans+1;
    }
}