import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] temp = new int[Math.min(nums1.length, nums2.length)];
        int c = 0;

        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    boolean exists = false;
                    for(int k = 0; k < c; k++){
                        if(temp[k] == nums1[i]){
                            exists = true;
                            break;
                        }
                    }
                    if(!exists){
                        temp[c] = nums1[i];
                        c++;
                    }
                    break;
                }
            }
        }

        int[] res = new int[c];
        for(int i = 0; i < c; i++){
            res[i] = temp[i];
        }

        return res;
    }
}
