class Solution {
    public int[][] directions = {{1, 0}, {-1, 0},{0, 1}, {0, -1}};
    List<List<Integer>> ans=new ArrayList<>();
    //List<Integer> part=new ArrayList<>();

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int rows=heights.length;
        int cols=heights[0].length;
        boolean[][] pac=new boolean[rows][cols];
        boolean[][] atl=new boolean[rows][cols];
        for(int r=0;r<rows;r++){
            dfs(heights,pac,r,0);
            dfs(heights,atl,r,cols-1);
        }
        for(int c=0;c<cols;c++){
            dfs(heights,pac,0,c);
            dfs(heights,atl,rows-1,c);
        }
        for(int r=0;r<rows;r++){
            for(int c=0;c<cols;c++){
                if (pac[r][c] && atl[r][c]) {
                    ans.add(Arrays.asList(r, c));
                }
            }
        }
        return ans;


    }
    public void dfs(int[][] heights,boolean[][] ocean,int r,int c){
        ocean[r][c]=true;
        for(int[] d:directions){
            int nr=r+d[0];
            int nc=c+d[1];
            if(nr>=0 && nc>=0 && nr<heights.length && nc <heights[0].length){
                if(!ocean[nr][nc]){
                    if(heights[nr][nc]>=heights[r][c]){
                        dfs(heights,ocean,nr,nc);
                    }
                }
            }
        }
    }
}