class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] ind=new int[numCourses];
        int[][] adj=new int[numCourses][numCourses];
        for(int i=0;i<prerequisites.length;i++){
            int a=prerequisites[i][0];
            int b=prerequisites[i][1];
            if(adj[b][a]==0){
                adj[b][a]=1;
                ind[a]++;
            }

        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(ind[i]==0){
                q.add(i);

            }

        }
        int count=0;
        while(!q.isEmpty()){
            int node=q.poll();
            count++;
            for(int i=0;i<numCourses;i++){
                if(adj[node][i]==1){
                    ind[i]--;
                    if(ind[i]==0){
                        q.add(i);
                    }
                }
            }
        }
        return count==numCourses;



    }
}