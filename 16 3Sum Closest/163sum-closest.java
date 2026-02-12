class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
        int res=nums[0]+nums[1]+nums[2];

        for(int i=0;i<n-2;i++){
            int p=i+1;
            int k=n-1;
            
            while(p<k){
                int sum=nums[i]+nums[p]+nums[k];
                if(Math.abs(target-sum) <= Math.abs(target-res)){
                    res=sum;

                }
                
                if(sum<target)p++;
                else if(sum>target) k--;
                else return target;
                
            }
            

        }
        return res;
    }
}