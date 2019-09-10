class Solution {
    public int findMin(int[] nums) {
        int i=0;
        if (nums.length==1){
            return nums[0];
        }
        while(nums[i]<nums[i+1]){
            i++;
            if (i==nums.length-1){
                return nums[0];
            }
        }
        return nums[i+1];
    }
}
