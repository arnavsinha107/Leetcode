class Solution {
    public int alternatingSubarray(int[] nums) {
        int j=0;
        int ans=0;
        int n=nums.length;
        //int l=0;
        int curr=0;
        int flag=0;
        for(int i=1;i<n;i++){
            
            if(nums[i]-nums[j]==Math.pow(-1,i+1)&& (curr>0 || nums[i]-nums[j]==1)){
                if(flag==0){
                    //System.out.println(nums[i]);
                    curr++;
                }
                else {
                    flag=0;
                    curr=1;
                }
            }
            else if(nums[i]-nums[j]==Math.pow(-1,i) && (curr>0 || nums[i]-nums[j]==1)){
                if(flag==1){
                    //System.out.println(nums[i]-nums[j]);
                    curr++;
                }
                else {
                    flag=1;
                    curr=1;
                }
            }
            else{
                curr=0;
            }
            j++;
            ans=Math.max(ans,curr);
        }
        return ans==0?-1:ans+1;
    }
}