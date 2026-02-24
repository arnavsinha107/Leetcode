class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> s=new Stack<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] ans=new int[nums1.length];
        for(int i:nums2){
            while(!s.isEmpty() && s.peek()<i){
                map.put(s.pop(),i);
            
            }
            s.push(i);
        }
        for(int i=0;i<nums1.length;i++){
            ans[i]=map.getOrDefault(nums1[i],-1);
        }
        return ans;
    }
}