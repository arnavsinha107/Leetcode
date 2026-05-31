class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        int open=0;
        int close=0;
        StringBuilder stack=new StringBuilder();
        backtrack(ans,open,close,n,stack);
        return ans;
    }
    public void backtrack(List<String> ans,int open, int close, int n, StringBuilder stack){
        if(open==close && open==n){
            ans.add(stack.toString());
            return;
        }
        if(open>close){
            stack.append(')');
            backtrack(ans,open,close+1,n,stack);
            stack.deleteCharAt(stack.length()-1);
        }
        if(open<n){
            stack.append('(');
            backtrack(ans,open+1,close,n,stack);
            stack.deleteCharAt(stack.length()-1);
        }
    }
}