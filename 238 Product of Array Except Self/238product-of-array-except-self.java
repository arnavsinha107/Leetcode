class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer=new int[nums.length];
        int p=1;
        for(int i=0;i<nums.length;i++){
            answer[i]=p;
            p=p*nums[i];
        }
        p=1;
        for(int i=nums.length-1;i>=0;i--){
            answer[i]=answer[i]*p;
            p=p*nums[i];
        }
        return answer;
    }
}
/*
**Sliding Window**

```java
// Expand window to increase sum, shrink from left while sum >= target to find minimum length
```

**Binary Search + Prefix Sum**

```java
// Use prefix sums; for each start index binary search the smallest end index where subarray sum >= target
```*/
