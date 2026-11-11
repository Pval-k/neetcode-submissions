class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //nums1: [1|3]
        //nums2: [2|4]

        //arr: [1,2,3,4]

        //nums1: smaller array
        if(nums2.length < nums1.length){
            int[] temp = nums2;
            nums2 = nums1;
            nums1 = temp;
        }
        int i = 0;
        int j = nums1.length;

        int m = nums1.length;
        int n = nums2.length;

        int half = (m+n +1)/2;

        while(i<=j){
            //double check
            int nums1_divider = (i + j)/2;
            int nums2_divider = half - nums1_divider;

            int l1;
            int r1; 
            int r2;
            int l2;

            if(nums1_divider == 0){
                l1 = Integer.MIN_VALUE;
            } else{
                l1 = nums1[nums1_divider-1];
            }

            if(nums1_divider == m){
                r1 = Integer.MAX_VALUE;
            } else{
                r1 = nums1[nums1_divider];
            }

            if(nums2_divider == 0){
                l2 = Integer.MIN_VALUE;
            } else{
                l2 = nums2[nums2_divider-1];
            }
            if(nums2_divider == n){
                r2 = Integer.MAX_VALUE;
            } else{
                r2 = nums2[nums2_divider];
            }

            if(l1<=r2 && r1 >= l2){
                //if even, return double
                if((m+n)%2 == 0){
                    int left = Math.max(l1,l2);
                    int right = Math.min(r1,r2);

                    return (left + right)/2.0;
    
                } else{
                    return Math.max(l1,l2);
                }
                
            } else if(l1>r2){
                j = nums1_divider - 1;
            } else{
                i = nums1_divider + 1;
            }
            

        }
        return 0.0;
    }
}
