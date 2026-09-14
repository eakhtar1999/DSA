class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length;
        int idx=2;
        for(int k=2;k<nums.length;k++){
            if(nums[k] != nums[idx-2]){
                nums[idx++] = nums[k];
            }
        }       
        return idx;
    }
}