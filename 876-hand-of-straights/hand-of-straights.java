class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        
        if(hand.length%groupSize!=0)return false;
        Arrays.sort(hand);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<hand.length;i++){
            map.put(hand[i],map.getOrDefault(hand[i],0)+1);
        }
        for(int num:hand){
            if(map.get(num)>0){
                for(int i=num;i<num+groupSize;i++){
                    if(map.getOrDefault(i,0)==0)return false;
                    map.put(i,map.get(i)-1);
                }
            }
        }
        return true;
    }
}