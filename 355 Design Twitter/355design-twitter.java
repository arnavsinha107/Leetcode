class Twitter {
    int time;
    HashMap<Integer,Set<Integer>> followmap;
    HashMap<Integer,List<int[] >> tweetmap;
    
    public Twitter() {
        time=0;
        followmap=new HashMap<>();
        tweetmap=new HashMap<>();        
    }
    
    public void postTweet(int userId, int tweetId) {
        tweetmap.putIfAbsent(userId,new ArrayList<>());
        tweetmap.get(userId).add(new int[]{time++,tweetId});
    }
    
    public List<Integer> getNewsFeed(int userId) {
        List<int[]> feed=new ArrayList<>(tweetmap.getOrDefault(userId,new ArrayList<>()));
        for(int followeeId: followmap.getOrDefault(userId,new HashSet<>())){
            feed.addAll(tweetmap.getOrDefault(followeeId,new ArrayList<>()));
        }
        feed.sort((a,b)->b[0]-a[0]);
        List<Integer> res=new ArrayList<>();
        for (int i = 0; i < Math.min(10, feed.size()); i++) {
            res.add(feed.get(i)[1]);
        }
        return res;
    }
    
    public void follow(int followerId, int followeeId) {
        if(followerId!=followeeId){
            followmap.putIfAbsent(followerId, new HashSet<>());
            followmap.get(followerId).add(followeeId);
        }
    }
    
    public void unfollow(int followerId, int followeeId) {
        followmap.getOrDefault(followerId, new HashSet<>()).remove(followeeId);
    }
}
