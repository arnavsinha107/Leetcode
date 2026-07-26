class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> rows=new HashSet<>();
        HashSet<Integer> cols=new HashSet<>();

        //boolean flag=false;

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                
                if(matrix[i][j]==0){
                    System.out.println(i+" "+j);
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(rows.contains(i)|| cols.contains(j)){
                    matrix[i][j]=0;

                }
                
            }
        }



    }
}