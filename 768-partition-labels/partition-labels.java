class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),i);
        }
        ArrayList<Integer> ans=new ArrayList<>();
        int i=0;
        while(i<s.length()){
            int count=0;
            char a=s.charAt(i);
            int b=map.get(a);
            count += b+1;
            for(int j=i;j<=b;j++){
                if(map.get(s.charAt(j))>b){
                    b=map.get(s.charAt(j));
                    count = b+1;
                    System.out.println(count);
                }
            }
            i=count;
            ans.add(count);
        }
        for (i = ans.size() - 1; i > 0; i--) {
            int difference = ans.get(i) - ans.get(i - 1);
            ans.set(i, difference); 
        }
        return ans;

    }
}