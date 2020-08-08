class Solution2 {
    public int maxSubArray(int[] nums) {
        int max_end_here=nums[0],max_so_far=nums[0];
        for(int i=1;i<nums.length;i++){
            max_end_here=Math.max(nums[i],max_end_here+nums[i]);
            max_so_far=Math.max(max_end_here,max_so_far);
        }
        return max_so_far;
    }
}
