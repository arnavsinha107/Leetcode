class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        int left=0;
        int right=n-1;
        if(n==2) return nums[0]>=nums[1]? 0:1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(mid==0){
                return nums[mid+1]>nums[mid]? mid+1:mid;
            }
            if(nums[mid-1]<nums[mid] && nums[mid+1]<nums[mid]) return mid;
            if(nums[mid]<nums[mid+1])left=mid+1;
            else right=mid-1;
        }
        return left;
    }
}