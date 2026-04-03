class Solution {
    public int Area(int a,int b,int i,int j){
        int area=1;
        if(a>b){
            area=b*(j-i);
        }
        else{
            area=a*(j-i);
        }
        return area;
    }
    public int maxArea(int[] height) {
        int n=height.length;
        int max=-1;
        int p=0;
        int k=n-1;
        for(int i=0;i<n;i++){
            int temp=Area(height[p],height[k],p,k);
            if(temp>max){
                max=temp;
                
            }
            if(height[p]>height[k] && (k-1)!=0){
                k--;
            }
            else if(height[k]>=height[p] && (p+1) != n){
                p++;
            }
            if(p>k){
                break;
            }


        }
            
        return max;
    }
}