class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max =0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    
                    int a=dfs(grid,i,j);
                    if(a>max){
                        max=a;
                    }

                }
            }
        }
        return max;
    }
     public int dfs(int[][] grid,int i,int j){
        
        if(i>=grid.length || j>=grid[0].length || i<0 || j<0){
            return 0;
        }

        else if(grid[i][j]!=1){
            return 0;
        }
        else{
            grid[i][j]=-1;
            return (1 +
            + dfs(grid,i+1,j)
            + dfs(grid,i,j+1)
            + dfs(grid,i-1,j)
            + dfs(grid,i,j-1));
        }

    }
}