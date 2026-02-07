class Solution {
    public int[] sortedSquares(int[] nums) {
        int j=nums.length-1;
        int n=j+1;
        int k=0;
        int[] arr=new int[n];
        for(int i=n-1;i>=0;i--){
            if(Math.abs(nums[k])>Math.abs(nums[j])){
                arr[i]=nums[k]*nums[k];
                k++;

            }
            else{
                arr[i]=nums[j]*nums[j];
                j--;
            }
        }

        return arr;
        
    }
}