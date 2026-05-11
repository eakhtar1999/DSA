class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char lChar = s.charAt(left);
            char rChar = s.charAt(right);

            // 1. Skip non-alphanumeric from the left
            if (!Character.isLetterOrDigit(lChar)) {
                left++;
            } 
            // 2. Skip non-alphanumeric from the right
            else if (!Character.isLetterOrDigit(rChar)) {
                right--;
            } 
            // 3. Compare characters after converting to lowercase
            else {
                if (Character.toLowerCase(lChar) != Character.toLowerCase(rChar)) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}