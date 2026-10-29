class NumArray {
    private int[] prefixSums;

    public NumArray(int[] nums) {
        // Create a prefix sum array of size nums.length + 1
        prefixSums = new int[nums.length + 1];
        
        // Calculate the running totals
        for (int i = 0; i < nums.length; i++) {
            prefixSums[i + 1] = prefixSums[i] + nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        // The sum from left to right inclusive is the prefix sum up to right + 1 
        // minus the prefix sum up to left
        return prefixSums[right + 1] - prefixSums[left];
    }
}


/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */