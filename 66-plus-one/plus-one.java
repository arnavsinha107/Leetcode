class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer> list=new ArrayList<>();
        boolean flag=true;
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]!=9 && flag){
                digits[i]++;
                flag=false;
                list.add(digits[i]);
                
            }
            else if(digits[i]==9 && flag){
                digits[i]=0;
                list.add(digits[i]);
            }
            else{
                list.add(digits[i]);
            }
        }
        if (flag)list.add(1);
        Collections.reverse(list);
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            ans[i] = list.get(i);

        return ans;
    }
}