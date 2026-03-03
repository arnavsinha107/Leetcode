class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int max=0;
        int min=prices[0];
        for(int i=0;i<n;i++){
            if(min>prices[i]){
                min=prices[i];
            }
            else if(max<prices[i]-min){
                max=prices[i]-min;
            }
        }
        return max;
    }
}