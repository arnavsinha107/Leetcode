class Solution {
    List<List<String>> res=new ArrayList<>();
    List<String> curr=new ArrayList<>();
    public List<List<String>> partition(String s) {
        dfs(s,0,0);
        return res;
    }
    public void dfs(String s,int i,int j){
        if(j>=s.length()){
            if(i==j){
                res.add(new ArrayList<>(curr));
            }
            return;
        }
        if(isPali(s,i,j)){
            curr.add(s.substring(i,j+1));
            dfs(s,j+1,j+1);
            curr.remove(curr.size()-1);
        }
        dfs(s,i,j+1);

    }
    public boolean isPali(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}