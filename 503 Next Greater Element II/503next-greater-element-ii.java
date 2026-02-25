class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        Stack<Integer> s=new Stack<>();
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=-1;
        }
        for(int i=0;i<2*n;i++){
            int num=nums[i%n];
            while(!s.isEmpty() && nums[s.peek()]<num){
                ans[s.pop()]=num;
            }
            if(i<n){
                s.push(i);
            }
        }
        return ans;
    }
}