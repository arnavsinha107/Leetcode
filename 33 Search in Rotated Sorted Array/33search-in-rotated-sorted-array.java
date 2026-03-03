class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int left=0;
        int right=n-1;
        int a=0;
        if(n==1) return nums[0]==target?0:-1;
        if(n==2){
            if(nums[0]==target) return 0;
            else if(nums[1]==target) return 1;
            else return -1;
        }
        
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
        left=0;
        right=a-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]<target) left=mid+1;
            else right=mid-1;
        }
        left=a;
        right=n-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]<target) left=mid+1;
            else right=mid-1;
        }
        return -1;
    }
}
