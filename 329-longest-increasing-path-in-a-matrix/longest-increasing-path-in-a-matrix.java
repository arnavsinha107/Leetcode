class Solution {
    int[][] dp;
    public int longestIncreasingPath(int[][] matrix) {
        int max=0;
        dp = new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                int a=dfs(matrix,i,j);
                if(a>max)max=a;
            }
        }
        return max;
    }
    public int dfs(int[][] matrix,int i,int j){
        if(dp[i][j]!=0)return dp[i][j];
        int max=0;
        int a=matrix[i][j];
        if(valid(matrix,i+1,j) && matrix[i+1][j]>a){
            max=Math.max(max,dfs(matrix,i+1,j));
        }
        if(valid(matrix,i-1,j) && matrix[i-1][j]>a){
            max=Math.max(max,dfs(matrix,i-1,j));
        }
        if(valid(matrix,i,j+1) && matrix[i][j+1]>a){
            max=Math.max(max,dfs(matrix,i,j+1));
        }
        if(valid(matrix,i,j-1) && matrix[i][j-1]>a){
            max=Math.max(max,dfs(matrix,i,j-1));
        }
        dp[i][j]=max+1;
        return dp[i][j];
    }
    public boolean valid(int[][] matrix,int i,int j){
        if(i>=matrix.length || j>=matrix[0].length || i<0|| j<0)return false;
        else return true;
    }
}