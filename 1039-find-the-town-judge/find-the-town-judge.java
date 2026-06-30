class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] ind=new int[n];
        int[] out=new int[n];
        for(int i=0;i<trust.length;i++){
            int a=trust[i][0]-1;
            int b=trust[i][1]-1;
            ind[b]++;
            out[a]++;


        }
        for(int i=0;i<n;i++){
            if(ind[i]==n-1 &&out[i]==0){
                return i+1;
            }
        }
        return -1;
    }
}