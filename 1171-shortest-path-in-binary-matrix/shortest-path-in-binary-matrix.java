class Solution {
    int[][] directions={{0,1},{1,0},{1,1},{-1,0},{0,-1},{-1,-1},{-1,1},{1,-1}};
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n=grid.length;
        if(grid[0][0]==1 || grid[n-1][n-1]==1){
            return -1;
        }
        Queue<int[]> q=new LinkedList<>();
        boolean[][] visit=new boolean[n][n];
        q.offer(new int[]{0,0,1});
        visit[0][0]=true;
        while(!q.isEmpty()){
            int[] cell=q.poll();
            int r=cell[0];
            int c=cell[1];
            int len=cell[2];
            if(r==n-1 && c==n-1) return len;
            for(int[] direction:directions){
                int nr=r+direction[0];
                int nc=c+direction[1];
                //int nlen=len+direction[2];
                if(nr>=0 && nc>=0 &&  nr<n && nc<n && grid[nr][nc]==0){
                    if(!visit[nr][nc]){
                        visit[nr][nc]=true;
                        q.offer(new int[]{nr,nc,len+1});
                    }
                }
            }
        }
        return -1;

    }
}