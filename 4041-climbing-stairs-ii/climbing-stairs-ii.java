class Solution {
    public int climbStairs(int n, int[] costs) {
        
        int a=0, b=Integer.MAX_VALUE, c= Integer.MAX_VALUE;
        for( int i=1; i<=n; i++){
            int one = a+1;
            int two = (i-2 >= 0)? b+4 : Integer.MAX_VALUE;
            int three = (i-3 >= 0)? c+9 : Integer.MAX_VALUE;

            int curr = costs[i-1] + Math.min(one, Math.min(two, three));
            c=b;
            b=a;
            a=curr;
        }



        return a;
    }
}