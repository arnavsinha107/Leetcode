class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        int[] arr=new int[26];
        for(int i=0;i<s1.length();i++){
            arr[s1.charAt(i)-'a']++;
        }
        int need=s1.length();
        int l=0;
        for(int r=0;r<s2.length();r++){
            if(arr[s2.charAt(r)-'a']>0) need--;
            arr[s2.charAt(r)-'a']--;
            if(need==0) return true;
            if(r-l+1==s1.length()){
                if(arr[s2.charAt(l)-'a']>=0) need++;
                arr[s2.charAt(l)-'a']++;
                l++;
            }

        }
        return false;
    }
}