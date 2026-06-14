class Solution {
    HashSet<Integer> col=new HashSet<>();
    HashSet<Integer> pDiag=new HashSet<>();
    HashSet<Integer> nDiag=new HashSet<>();
    List<List<String>> res=new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        backtrack(0,n,board);
        return res;


        
    }
    public void backtrack(int r,int n,char[][] board){
        if(r==n){
            List<String> copy=new ArrayList<>();
            for(char[] row:board){
                copy.add(new String(row));

            }
            res.add(copy);
            return;
        }
        for(int c=0;c<n;c++){
            if(col.contains(c)||pDiag.contains(r+c)||nDiag.contains(r-c)){
                continue;
            }
            col.add(c);
            pDiag.add(r+c);
            nDiag.add(r-c);
            board[r][c]='Q';
            backtrack(r+1,n,board);
            
            col.remove(c);
            pDiag.remove(r+c);
            nDiag.remove(r-c);
            board[r][c]='.';
        }
    }
}
