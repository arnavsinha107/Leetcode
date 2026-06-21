class Solution {
    public void solve(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        // Start DFS from border O's and mark all connected O's as temporary T
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(i==0 || j==0 || i==n-1 || j==m-1 ){
                    if(board[i][j]=='O'){
                        dfs(board,i,j);
                    }
                }
               
            }
        }
        // Convert remaining 0's (surrounded regions) into X's
        for(int r=0;r<n;r++){
            for(int c=0;c<m;c++){
                if(board[r][c]=='O'){
                    board[r][c]='X';
                }
            }
        }

        // Restore border-connected regions from T back to O
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                if (board[r][c] == 'T') {
                    board[r][c] = 'O';
                }
            }
        }
       
       


    }
    public void dfs(char[][] board,int r,int c){
            int rows=board.length;
            int cols=board[0].length;

            // Stop if out of bounds or current cell is not O
            if (r < 0 || c < 0 || r == rows || c == cols || board[r][c] != 'O') {
                return;
            }

            board[r][c]='T';
            dfs(board, r + 1, c);
            dfs(board, r - 1, c);
            dfs(board, r, c + 1);
            dfs(board, r, c - 1);
    }
}