class Solution {
    public String removeKdigits(String num, int k) {
        if(k==num.length()) return "0";
        Stack<Integer> s=new Stack<>();
        int[] nums=new int[num.length()];
        for(int i=0;i<num.length();i++){
            nums[i]=num.charAt(i)-'0';
        }
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            while(!s.isEmpty() && s.peek()>n&& k>0){
                s.pop();
                k--;
            }
            s.push(n);
        }
        while(k>0){
            s.pop();
            k--;
        }
        StringBuilder sb=new StringBuilder();
        while(!s.isEmpty()){
            sb.append(s.pop());
        }
        sb.reverse();
        while(sb.length() > 1 && sb.charAt(0) == '0'){
            sb.deleteCharAt(0);
        }

        return sb.toString();
    }
}