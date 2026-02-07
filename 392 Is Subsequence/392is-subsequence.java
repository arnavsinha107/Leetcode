class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] sc=s.toCharArray();
        if(sc.length==0) return true;
        char[] tc=t.toCharArray();
        int k=0;
        for(int i=0;i<tc.length;i++){
            if(sc[k]==tc[i]){
                
                k++;

            }
            if(k==sc.length){
                return true;
            }
        }
        return false;
    }
}