class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int l=0;
        int r=intervals.length;
        //int a=Interger.MAX_VALUE;
        //boolean flag=false;
        int mid=0;
        if(intervals.length==0){
            return new int[][]{newInterval};
        }
        while(l<r){
            mid=l+(r-l)/2;
            
            if(newInterval[0]>intervals[mid][0]){
                l=mid+1;
                
            }
            else{
                r=mid;
            }
        }
        int pos=l;
        
        ArrayList<int[]> ans=new ArrayList<>();
        for(int i=0;i<intervals.length;i++){
            if(i==pos){
                ans.add(newInterval);
            }
            ans.add(intervals[i]);
        }
        
        if (pos==intervals.length) {
            ans.add(newInterval);
        }
        return merge(ans.toArray(new int[ans.size()][]));
    }
    public int[][] merge(int[][] intervals) {
        List<int[]> ans=new ArrayList<>();
        int start=intervals[0][0];
        int end=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=end){
                end=Math.max(end,intervals[i][1]);
            }
            else{
                ans.add(new int[]{start,end});
                start=intervals[i][0];
                end=intervals[i][1];
            }
        }
        ans.add(new int[]{start,end});
        return ans.toArray(new int[ans.size()][]);
    }
}