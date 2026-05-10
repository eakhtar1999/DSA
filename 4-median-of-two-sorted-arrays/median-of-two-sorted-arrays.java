class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length){
            return findMedianSortedArrays(nums2, nums1);
        }
        int len1= nums1.length, len2 = nums2.length;
        int left = 0, right= len1;

         System.out.println(nums1.length+" "+ nums2.length);
        while(left<=right){
            int part1 = (left + right)/2;
            int part2 = (len1 + len2 +1)/2 - part1;

            int lmax1 = (part1==0) ? Integer.MIN_VALUE : nums1[part1-1];
            int rmin1= (part1 == len1) ? Integer.MAX_VALUE : nums1[part1] ;
            int lmax2 = (part2==0) ? Integer.MIN_VALUE : nums2[part2 -1 ];
            int rmin2 = (part2 == len2) ? Integer.MAX_VALUE : nums2[part2];

            System.out.println(lmax1+" "+ rmin1+" "+ lmax2+" "+ rmin2+" ");

            if(lmax1 <= rmin2 && lmax2<= rmin1){
                if((len1 + len2)%2 == 0){
                    return (Math.max(lmax1, lmax2) + Math.min(rmin1, rmin2))/2.0;
                }
                else{
                    return (double) Math.max(lmax1, lmax2);
                }
            }else if(lmax1> rmin2){
                right=part1-1;
            }
            else{
                left=part1+1;
            }
        }
        return 0.0;
    }
}

// [1 4  | 6 12 14]
// [2 5|  29]. 
// [ 1 2 4 5 | 6 12 14 29]. = 5.5