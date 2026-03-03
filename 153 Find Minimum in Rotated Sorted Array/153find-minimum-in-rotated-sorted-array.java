class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int left=0;
        int right=n-1;
        int a=0;
        if(n==1) return nums[0];
        if(n==2) return nums[0]>=nums[1] ? nums[1]:nums[0];
        
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]>nums[left]&&nums[mid]>nums[right]) left=mid;
            else if(nums[mid]<nums[right]&&nums[mid]<nums[left]) right=mid;
            else{
                if(left==0&&right==n-1) a=0;
                else a=mid+1;
                break;
                
            }
        }
        return nums[a];
            
        
    }
}