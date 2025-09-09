import java.util.HashSet;
class Solution {
    public int longestConsecutive(int[] nums) {
        int longeststreak=0;
        HashSet<Integer> n=new HashSet<>();
        for(int i:nums){
            n.add(i);

        }
        for(int i:n){
            if(!n.contains(i-1)){
                int m=i+1;
            
                while(n.contains(m)){
                    m++;   

                }
            longeststreak=Math.max(longeststreak,m-i);
            }

        }
        return longeststreak;
        

    }
}