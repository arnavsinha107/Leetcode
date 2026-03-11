class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n = arr.length;
        int l=0;
        int r = n-1;
        List<Integer> ans = new ArrayList<>();

        while((r-l+1)>k){
            int left = Math.abs(arr[l] -x);
            int right = Math.abs(arr[r] -x);
            if(left>right){
                l++;
            } else{
                r--;
            }
        }

        for(int i=l;i<=r;i++){
            ans.add(arr[i]);
        }

        return ans;
    }
}
/*
Core Idea

At every step we compare:

|arr[l] - x|   vs   |arr[r] - x|

Whichever element is farther from x gets removed.

if(left > right)
    l++
else
    r--

Meaning:

• left element worse → remove it
• right element worse → remove it

Because the array is sorted, the remaining window will always stay contiguous.
*/