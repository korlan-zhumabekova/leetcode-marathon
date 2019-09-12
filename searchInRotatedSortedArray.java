class Solution {
    public int search(int[] nums, int target) {
        int half = nums.length/2;
        int min=0;
        int max=nums.length-1;
        while (min!=max-1){
            if (nums[min]==target){
                return min;
            } else if (nums[max]==target){
                return max;
            } else if (nums[half]==target){
                return half;
            } else {
                if (target>nums[half]){
                    
                }

                if (nums[half]>nums[min]){
                    half=(max-min)/2+min;
                    if (target<nums[half]){
                        max=half;
                    } else {
                        min=half;
                    }
                } else if (nums[max]>nums[half]){
                    if (target>nums[min] && target<nums[half]){
                        max=half;
                        half=(max-min)/2;
                    } else {
                        min=half;
                        half=(max-min)/2+min;
                    }
                }
            }
        }
    }
}