class MedianFinder {
    PriorityQueue<Integer> minh;
    PriorityQueue<Integer> maxh;

    public MedianFinder() {
        minh=new PriorityQueue<>();
        maxh=new PriorityQueue<>(Collections.reverseOrder());

    }
    
    public void addNum(int num) {
        if(minh.isEmpty() || num>=minh.peek())minh.add(num);
        else maxh.add(num);
        
        while(Math.abs(minh.size()-maxh.size())>1){
            if(minh.size()>maxh.size())maxh.add(minh.poll());
            else{
                minh.add(maxh.poll());
            }
        }
    }
    
    public double findMedian() {
        double a=0.0;

        if(minh.size()==maxh.size()){
            a=(double)(minh.peek()+maxh.peek())/2;
        }
        else{
            if(minh.size()>maxh.size()){
                a=(double)minh.peek();
            }
            else{
                a=(double)maxh.peek();
               
            }
        }
        
        // int[] temp=new int[(n/2)+1];
        // for(int i=0;i<temp.length;i++){
        //     temp[i]=pq.poll();
        //     //System.out.print(temp[i]+" ");
        // }
        // int k=temp.length-1;
        // if(n%2==0){
        //     a=(double)(temp[k]+temp[k-1])/2;
        // }
        // else{
        //     a=(double)temp[k];
        // }
        // for(int i=0;i<=k;i++){
        //     pq.add(temp[i]);
        // }
        // //System.out.print("\n");
        return a;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */