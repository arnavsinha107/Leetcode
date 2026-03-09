class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq=new int[26];
        int l=0;
        int max=0;
        int maxf=0;
        for(int r=0;r<s.length();r++){
            int idx=s.charAt(r)-'A';
            freq[idx]++;
            maxf=Math.max(maxf,freq[idx]);
            while((r-l+1)-maxf>k){
                freq[s.charAt(l)-'A']--;
                l++;
            }
            max=Math.max(r-l+1,max);
        }
        return max;

    }
}

/*
freq[26] → frequency of each character inside the current window

l → left pointer of sliding window

r → right pointer expanding the window

maxf → count of the most frequent character in the window

(r-l+1) → current window size

(r-l+1) - maxf → characters that must be replaced to make window uniform

if replacements > k → shrink window from left

max → longest valid window found
*/