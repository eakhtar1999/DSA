import java.util.*;

class Solution {
    public boolean isHappy(int n) {
        int slow = n, fast = n;
        do {
            slow = digitSquareSum(slow);                      // 1 step
            fast = digitSquareSum(digitSquareSum(fast));      // 2 steps
        } while (slow != fast);
        return slow == 1;
    }
    private int digitSquareSum(int n) {
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum += d * d;
            n /= 10;
        }
        return sum;
    }
}
