class Solution {
    public int getSum(int a, int b) {
        String c=String.format("%32s",Integer.toBinaryString(a)).replace(' ','0');
        String d=String.format("%32s",Integer.toBinaryString(b)).replace(' ','0');
        StringBuilder binary=new StringBuilder();
        int o=0;
        for(int i=31;i>=0;i--){
            int x=c.charAt(i)-'0';
            int y=d.charAt(i)-'0';
            int sum=x+y+o;
            binary.append(sum%2);
            o=sum/2;
        }
        binary.reverse();
        int res=0;
        for(int i=0;i<32;i++){
            if(binary.charAt(31-i)=='1'){
                res =res | (1<<i);
            }
        }
        return res;
    }
}