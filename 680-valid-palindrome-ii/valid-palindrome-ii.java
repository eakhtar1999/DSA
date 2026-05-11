class Solution {
    public boolean validPalindrome(String s) {
        int l=0, r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return isPalindrome(s,l,r-1) || isPalindrome(s,l+1,r);
            }
            l++;r--;
        }
        return true;
    }
    private boolean isPalindrome(String s, int l, int r){
        int start = l, end=r;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end))return false;
            start++;end--;
        }
        return true;
    }
}