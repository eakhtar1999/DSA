class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int currSum = 0;
        int i=0,minCount=Integer.MAX_VALUE;
        for(int j=0; j < nums.length; j++){
            currSum+=nums[j];
            System.out.println(currSum + " ");
            if(currSum<target)continue;
            while(currSum>=target){
                minCount = Math.min(minCount, j-i+1);
                currSum-=nums[i];
                i++;
            }
            
            
        }
        return minCount==Integer.MAX_VALUE? 0 : minCount;
    }
}