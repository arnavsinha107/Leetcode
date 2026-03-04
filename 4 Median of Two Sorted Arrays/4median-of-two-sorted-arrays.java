class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length){
            int[] t=nums1;
            nums1=nums2;
            nums2=t;

        }
        int m=nums1.length;
        int n=nums2.length;
        int left=0;
        int right=m;
        while(left<=right){
            int p1=(left+right)/2;
            int p2=(m+n+1)/2-p1;
            int l1=(p1==0)?Integer.MIN_VALUE : nums1[p1-1];
            int r1=(p1==m)?Integer.MAX_VALUE:nums1[p1];
            int l2 = (p2 == 0) ? Integer.MIN_VALUE : nums2[p2 - 1];
            int r2 = (p2 == n) ? Integer.MAX_VALUE : nums2[p2];
            if(l1<=r2&&l2<=r1){
                if((m+n)%2==0){
                    return (Math.max(l1,l2)+Math.min(r1,r2))/2.0;
                }
                else{
                    return(Math.max(l1,l2));

                }
            }
            else if(l1>r2){
                right=p1-1;
            }
            else{
                left=p1+1;
            }

        }
        return 0.0;

    }
}

/*
MEDIAN OF TWO SORTED ARRAYS — STEPWISE IDEA

1. Always binary search the smaller array.
   If nums1 is larger than nums2 → swap them.

2. Define:
      m = nums1.length
      n = nums2.length

3. Binary search on nums1 partitions:
      left = 0
      right = m

4. Choose partition positions:
      p1 = (left + right) / 2
      p2 = (m + n + 1) / 2 - p1

5. Determine boundary elements around partitions:

      l1 = (p1 == 0) ? -∞ : nums1[p1-1]
      r1 = (p1 == m) ? +∞ : nums1[p1]

      l2 = (p2 == 0) ? -∞ : nums2[p2-1]
      r2 = (p2 == n) ? +∞ : nums2[p2]

6. Check if partition is valid:

      l1 ≤ r2  AND  l2 ≤ r1

   If true → correct split found.

7. Compute median:

      If total length even:
         median = (max(l1,l2) + min(r1,r2)) / 2

      If odd:
         median = max(l1,l2)

8. If partition invalid:

      If l1 > r2 → move left
         right = p1 - 1

      Else → move right
         left = p1 + 1
         */