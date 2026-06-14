class Solution {
    public int numIslands(char[][] grid) {
        // List<List<Integer>> graph=new ArrayList<>();
        // for(int i=0;i<grid.length;i++){
        //     for(int j=0;j<grid[0].length;j++){
        //         if(grid[i][j]=='1'){
        //             List<Integer> set=new ArrayList<>();
        //             set.add(i);
        //             set.add(j);
        //             graph.add(set);

        //         }
        //     }
        // }
        // System.out.print(graph);
        int count =0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    count++;
                    dfs(grid,i,j);

                }
            }
        }
        return count;
    }
    public void dfs(char[][] grid,int i,int j){
        
        if(i>=grid.length || j>=grid[0].length || i<0 || j<0){
            return;
        }

        else if(grid[i][j]!='1'){
            return;
        }
        else{
            grid[i][j]='x';
            dfs(grid,i+1,j);
            dfs(grid,i,j+1);
            dfs(grid,i-1,j);
            dfs(grid,i,j-1);
        }

    }
}