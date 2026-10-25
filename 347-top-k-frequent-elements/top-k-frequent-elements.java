class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // map value-to-count
        Map<Integer, Integer> count = new HashMap<>();
        for(int x : nums) count.merge(x, 1, Integer::sum);

        // we will store only value but for order we will decide via map lookup forevery input
        PriorityQueue<Integer> heap = new PriorityQueue<>( (a, b) -> Integer.compare(count.get(a), count.get(b)));

        // populate heap
        for(int val : count.keySet()){
            heap.offer(val);
            if(heap.size() > k ) heap.poll();
        }

        int[] res = new int[k];
        for(int i=k-1; i>=0; i--){
            res[i] = heap.poll();
        }
        return res;
    }
}