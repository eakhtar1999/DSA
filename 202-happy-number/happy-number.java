class Solution {
    public boolean isHappy(int n) {
        int slow = next(n);
        int fast = next(next(n));
        while(fast!=slow){
            slow = next(slow);
            fast= next(next(fast));
        }
        return slow==1? true : false;

    }
    private int next(int n){
        int res=0;
        while(n>0){
            int d = n%10;
            res+= d*d;
            n =n/10;
        }
        return res;
    }
}