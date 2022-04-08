class KthLargest {
    PriorityQueue<Integer> minHeap;
    int k=0;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        minHeap = new PriorityQueue<>();
        for(int n:nums){
            // System.out.println("Number added "+n);
            minHeap.add(n);
            if(minHeap.size()>k){
                int j =minHeap.poll();
                // System.out.println("Polled in kth largest func "+k);
            }
        }
    }
    public int add(int val) {
        // System.out.println("Number added "+val);
        minHeap.add(val);
        if(minHeap.size()>k){
            int n = minHeap.poll();
            // System.out.println("Polled in add func"+n);
        }
        // System.out.println("Kth Largest "+minHeap.peek());
        return minHeap.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */