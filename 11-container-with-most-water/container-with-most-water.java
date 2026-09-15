public class Solution {
    public int maxArea(int[] heights) {
        int l=0,r=heights.length-1;
        int maxAmount = 0,currAmount=0;
        while(l<r){
            currAmount = (r-l) * Math.min(heights[l], heights[r]);
            if(maxAmount < currAmount)maxAmount=currAmount;
            System.out.println(maxAmount + " " + currAmount);
            if(heights[l] >= heights[r]) r--;
            else l++;
        }
        return maxAmount;
    }
}