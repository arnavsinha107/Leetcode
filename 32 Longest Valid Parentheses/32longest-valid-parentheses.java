class Solution {
    public int longestValidParentheses(String s) {
        char[] arr=s.toCharArray();
        Stack<Integer> stk=new Stack<>();
        stk.push(-1);
        int result=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='('){
                stk.push(i);
            }
            else{
                if(!stk.empty()){
                    int c=stk.pop();
                }
                if(!stk.empty()){
                    result=Math.max(result,i-stk.peek());


                }
                else{
                    stk.push(i);
                }
                

            }
            
        }
        return result;
    }
}