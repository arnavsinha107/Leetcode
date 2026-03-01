class Solution {
    public int largestRectangleArea(int[] heights) {
        if(heights.length==1) return heights[0];

        int max=heights[0];
        Stack<Integer> stack=new Stack<>();
        stack.push(0);
        for(int i=0;i<heights.length;i++){
            
            if(heights[stack.peek()]>heights[i]){
                while(!stack.empty()&&heights[stack.peek()]>heights[i]){

                    int height=heights[stack.pop()];
                    int left=stack.empty()? -1:stack.peek();
                    int width=i-left-1;
                    int area=height*width;
                    if(area>max){
                        max =area;
                    }
                }
                
            }
           
            stack.push(i);
        }

        while(!stack.empty()){

            int height=heights[stack.pop()];
            int left=stack.empty()? -1:stack.peek();
            int width=heights.length-left-1;
            int area=height*width;
            if(area>max){
                max =area;
            }
        }


        return max;

    }
 
}
// Use a monotonic increasing stack (store indices).
// When current height is smaller than stack top,
// pop and calculate area for popped bar.
// Right boundary = current index.
// Left boundary = stack.peek() after pop (or -1 if empty).
// Width = right - left - 1.
// Process till i < n .
// If stack is not empty, right=heights.length, left=stack.pop()