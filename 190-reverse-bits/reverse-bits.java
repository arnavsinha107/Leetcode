class Solution {
    public int reverseBits(int n) {
        StringBuilder binary=new StringBuilder();
        for(int i=0;i<32;i++){
            if((n&(1<<i)) != 0){
                binary.append("1");
            }
            else{
                binary.append("0");
            }
        }
        int res=0;
        String reverse=binary.reverse().toString();
        for(int i=0;i<32;i++){
            if(reverse.charAt(i)=='1'){
                res =res | (1<<i);
            }
        }
        return res;
    }
}