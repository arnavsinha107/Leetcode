class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        
        List<Integer>[] bucket=new ArrayList[nums.length+1];
        for(int key:map.keySet()){
            int freq=map.get(key);
            if(bucket[freq]==null){
                bucket[freq]=new ArrayList<>();
            }
            bucket[freq].add(key);
        }

        int[] res=new int[k];
        int idx=0;

        for(int i=bucket.length-1;i>=0;i--){
            if(bucket[i]!=null){
                for(int num:bucket[i]){
                    res[idx++]=num;
                    if(idx==k) return res;
                }
            }
        }
        return res;
    }
}