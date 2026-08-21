class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),i);
        }
        ArrayList<Integer> ans=new ArrayList<>();
        int i=0;
        while(i<s.length()){
            int start=i;
            int b=map.get(s.charAt(i));
            for(int j=i;j<=b;j++){
                if(map.get(s.charAt(j))>b){
                    b=map.get(s.charAt(j));

                }
            }
            
            ans.add(b-start+1);
            i=b+1;
        }

        return ans;

    }
}