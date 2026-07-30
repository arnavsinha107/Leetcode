class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<>();
        while(!set.contains(n)){
            set.add(n);
            n=sumofsquares(n);
            if(n==1){
                return true;
            }
            
        }
        return false;
    }
    public int sumofsquares(int n){
        int output=0;
        while(n>0){
            int digit=n%10;
            digit=digit*digit;
            output+=digit;
            n/=10;
        }
        return output;
    }
}