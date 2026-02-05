class Solution {
    public boolean isPalindrome(String s) {
        char[] arr=new char[s.length()];
        int c=0;
        for(int i = 0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                arr[c]=Character.toLowerCase(s.charAt(i));
                c++;

            }
        }
        int n=c;
        for(int i=0;i<n/2;i++){
            if(arr[i]!=arr[n-i-1]){
                return false;
            }
            
        }
        return true;
    }
}