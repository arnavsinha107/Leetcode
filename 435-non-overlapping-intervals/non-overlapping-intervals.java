class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]> list=new ArrayList<>();
        int ans=0;
        int start=intervals[0][0];
        int end=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<end){
                end=Math.min(intervals[i][1],end);
            }
            else{
                list.add(new int[]{start,end});
                start=intervals[i][0];
                end=intervals[i][1];
            }
        }
        list.add(new int[]{start,end});
        // for(int[] i:list){
        //     System.out.print(i[0]+" "+i[1]+",");
        // }
        return intervals.length-list.size();
    }
}