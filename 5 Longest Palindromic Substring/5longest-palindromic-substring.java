class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==1)return s;
        String r=new StringBuilder(s).reverse().toString();
        int n=s.length();
        int[][] dp=new int[n+1][n+1];
        int maxLen=0;
        int end=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(s.charAt(i-1)==r.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                    int len=dp[i][j];
                    int originalStart=i-len;
                    int reversedStart=n-j;
                    if(originalStart==reversedStart){
                        if(len>maxLen){
                            maxLen=len;
                            end=i-1;
                        }
                    }
                }
                else{
                    dp[i][j]=0;
                }
            }
        }
        return s.substring(end-maxLen+1,end+1);
        
    }

 

}