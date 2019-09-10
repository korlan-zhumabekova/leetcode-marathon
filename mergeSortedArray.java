class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        while (true){
            if (m==0 || n==0){
                break;
            }
            while(nums1[m-1]>=nums2[n-1]){
                nums1[m+n-1]=nums1[m-1];
                m--;
                if (m==0 || n==0){
                    break;
                }
            }
            if (m==0 || n==0){
                break;
            }
            while(nums1[m-1]<nums2[n-1]){
                nums1[m+n-1]=nums2[n-1];
                n--;
                if (m==0 || n==0){
                    break;
                }
            }            
        }
        if (m==0){
           while(n>0){
               nums1[n-1]=nums2[n-1];
               n--;
           }
        }        
    }
}
