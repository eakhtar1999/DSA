class KthLargest {
    private final PriorityQueue<Integer> heap = new PriorityQueue<>();   // min-heap
    private final int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        for (int x : nums) add(x);
    }

    public int add(int val) {
        heap.offer(val);
        if (heap.size() > k) heap.poll();        // evict the smallest
        return heap.peek();
    }
}