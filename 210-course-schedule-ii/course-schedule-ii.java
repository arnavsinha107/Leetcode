class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int n=numCourses;
        int p=prerequisites.length;

        int[] ind =new int[n];
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] pre:prerequisites){
            ind[pre[0]]++;
            adj.get(pre[1]).add(pre[0]);
        }

        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(ind[i]==0){
                q.add(i);
            }
        }
        
        int count=0;
        int[] output=new int[n];
        while(!q.isEmpty()){
            int node=q.poll();
            output[count]=node;
            count++;
            for (int nei : adj.get(node)) {
                ind[nei]--;
                if (ind[nei] == 0) {
                    q.add(nei);
                }
            }
        }

        if (count != numCourses) {
            return new int[0];
        }
        return output;
    }
}