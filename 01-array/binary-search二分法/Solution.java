class Solution {
    public int search(int[] nums, int target) {
        int high = nums.length - 1, low = 0;
        while(low <= high) {
            int mid = ((high - low) >> 1) + low;
            if(nums[mid] == target) {
                return mid;
            }else if(nums[mid] > target) {
                high = mid - 1;
            }else if(nums[mid] < target) {
                low = mid + 1;
            }
        }
        return -1;
    }
}