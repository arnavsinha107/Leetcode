class Solution {
    public void sortColors(int[] nums) {
        int r=0;
        int w=0;
        int b=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                r++;
            }
            else if(nums[i]==1){
                w++;
            }
            else{
                b++;
            }

        }
        int idx=0;
        for(int i=0;i<r;i++){
            nums[idx]=0;
            idx++;
        }
        for(int i=0;i<w;i++){
            nums[idx]=1;
            idx++;
        }
        for(int i=0;i<b;i++){
            nums[idx]=2;
            idx++;
        }

    }
}