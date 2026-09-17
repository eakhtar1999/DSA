class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        for (int i=0; i<n; i++) {
	    	if (i<2) dp[i] = cost[i];
	    	else dp[i] = cost[i] + Math.min(dp[i-1], dp[i-2]);
	    }
	    return Math.min(dp[n-1], dp[n-2]);
    }
    
}

//So "start from step 0 or step 1" means: at the very beginning, before any cost has been paid, you get a free choice between two entry points, and the DP has to consider both possibilities and let the cheaper one win.

//That's exactly why dp[0] = cost[0] and dp[1] = cost[1] are set independently rather than dp[1] = cost[1] + dp[0] — if it were the latter, you'd be forcing every path to step onto 0 first (paying for it) before it could ever reach 1, which would contradict "you may start directly at 1 without ever touching 0."