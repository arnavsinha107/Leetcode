class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if(gas.length==1 && gas[0]==cost[0])return 0;
        int[] diff=new int[gas.length];
        for(int i=0;i<gas.length;i++){
            diff[i]=gas[i]-cost[i];
        }
        int idx=0;
        while(idx<diff.length){
            if(diff[idx]<=0)idx++;
            else{
                int a=0;
                for(int i=idx;i<diff.length;i++){
                    //System.out.println(i);
                    a+=diff[i];
                    if(a<0)break;
                }
                if(a<0)idx++;
                else{
                    for(int i=0;i<idx;i++){
                        a+=diff[i];
                        if(a<0)break;
                    }
                }
                if(a<0)idx++;
                else return idx;
            }
        }
        return -1;
    }
}