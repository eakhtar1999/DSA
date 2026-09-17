class Solution {
    public int climbStairs(int n) {
        Map<Integer, Integer> memo = new HashMap<>();   // generic type declared, not raw Map
        return util(n, memo);
    }

    private int util(int n, Map<Integer, Integer> memo) {
        if (n <= 2) return n;                            // base case FIRST, matches recursion
        if (!memo.containsKey(n)) {                       // containsKey, not contains
            memo.put(n, util(n - 1, memo) + util(n - 2, memo));
        }
        return memo.get(n);
    }
}