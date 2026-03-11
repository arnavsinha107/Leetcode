class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        
        int[] ans=new int[n-k+1];
        Deque<Integer> d=new ArrayDeque<>();
        int i=0;
        for(int r=0;r<n;r++){
            while(!d.isEmpty() && nums[d.peekLast()]<nums[r]){
                d.pollLast();
            }
            d.addLast(r);
            if(d.peekFirst()<=r-k){
                d.pollFirst();
            }
            if(r>=k-1){
                ans[i++]=nums[d.peekFirst()];
            }
        }
        return ans;

    }   
}