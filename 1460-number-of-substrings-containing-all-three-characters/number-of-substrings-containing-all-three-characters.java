class Solution {
    public int numberOfSubstrings(String s) {
        int count=0;
        int left=0;
        int[] abc=new int[26];
        
        
        //System.out.print(s.substring(0,1));

        for(int right=0;right<s.length();right++){
            abc[s.charAt(right)-'a']++;
            while(abc[0]>0&&abc[1]>0&&abc[2]>0){
                count+=s.length()-right;
                abc[s.charAt(left)-'a']--;
                left++;
            }
        }
        
        return count;

    }
    // public boolean valid(String s,int[] abc){
    //     if(s.length()>=3&&abc[0]==-1 && abc[1]==-1 && abc[2]==-1){
    //         return true;
    //     }
    //     return false;
    // }
}