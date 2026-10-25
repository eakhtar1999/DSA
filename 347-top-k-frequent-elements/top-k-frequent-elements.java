import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int x : nums) {
            count.merge(x, 1, Integer::sum);
        }

        // Fix: Use raw type initialization for the array and cast/suppress warning
        @SuppressWarnings("unchecked")
        List<Integer>[] bucket = new ArrayList[nums.length + 1]; 
        
        for (Map.Entry<Integer, Integer> e : count.entrySet()) {
            int f = e.getValue();
            if (bucket[f] == null) {
                bucket[f] = new ArrayList<>();
            }
            bucket[f].add(e.getKey());
        }
        
        int[] res = new int[k];
        int idx = 0;
        for (int f = bucket.length - 1; f >= 1 && idx < k; f--) {
            if (bucket[f] == null) continue;
            for (int val : bucket[f]) {
                if (idx < k) {
                    res[idx++] = val;
                }
            }
        }
        return res;
    }
}
