import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> count = new HashMap<>();
    for (int x : nums) count.merge(x, 1, Integer::sum);

    List<List<Integer>> bucket = new ArrayList<>();            // index = frequency (0..n)
    for (int f = 0; f <= nums.length; f++) bucket.add(new ArrayList<>());
    for (Map.Entry<Integer, Integer> e : count.entrySet()) {
        bucket.get(e.getValue()).add(e.getKey());
    }
    int[] res = new int[k];
    int idx = 0;
    for (int f = nums.length; f >= 1 && idx < k; f--) {
        for (int val : bucket.get(f)) {
            if (idx < k) res[idx++] = val;
        }
    }
    return res;
}
}
