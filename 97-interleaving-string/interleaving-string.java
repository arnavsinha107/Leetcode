class Solution {
    public Boolean[][] dp;
    public boolean isInterleave(String s1, String s2, String s3) {
        if(s1.length()+s2.length()!=s3.length())return false;
        dp=new Boolean[s1.length()+1][s2.length()+1];
        return dfs(s1,s2,s3,0,0,0);
    }
    public boolean dfs(String s1,String s2,String s3, int a, int b, int c){
        if(c==s3.length())return true;
        if(dp[a][b]!=null)return dp[a][b];
        boolean res=false;
        if(a<s1.length() && s1.charAt(a)==s3.charAt(c)){
            res=dfs(s1,s2,s3,a+1,b,c+1);
        }
        if(!res&& b<s2.length() && s2.charAt(b)==s3.charAt(c)){
            res=dfs(s1,s2,s3,a,b+1,c+1);
        }
        dp[a][b]=res;
        return res;
    }
}