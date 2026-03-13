class Solution {
    public String minWindow(String s, String t) {
        int[] arr=new int[128];
        for(char c:t.toCharArray()) arr[c]++;
        int need=t.length();
        int l=0;
        int minLen=Integer.MAX_VALUE;
        int start=0;
        for(int r=0;r<s.length();r++){
            if(arr[s.charAt(r)]>0)need--;
            arr[s.charAt(r)]--;
            while(need==0){
                if(r-l+1<minLen){
                    minLen=r-l+1;
                    start=l;

                }
                arr[s.charAt(l)]++;
                if(arr[s.charAt(l)]>0)need++;
                l++;
            }

        }
        if(minLen==Integer.MAX_VALUE) return "";
        return s.substring(start,start+minLen);
    }
}