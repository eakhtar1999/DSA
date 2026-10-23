class Solution {
    public int trap(int[] height) {
        int l =0, r=height.length-1, leftMax=0, rightMax=0, area =0;
        while(l<r){
            if(height[l] < height[r]){// this makes sure that whichever is lesser is safe to proceeed since its opposite is higher and we are doing a point calculation
                if(height[l]>= leftMax) leftMax = height[l];
                else area+=(leftMax-height[l]);  // this makes us safe about corresponding side
                l++;
            }else{
                if(height[r]>= rightMax) rightMax = height[r];
                else area+=(rightMax-height[r]);
                r--;
            }
        }
        return area;
    }
}