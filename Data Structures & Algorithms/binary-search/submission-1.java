class Solution {
    public int search(int[] nums, int target) {
        int i = 0;
        int left = 0;
        int right = nums.length - 1;
        int middle = Math.round(nums.length / 2);

        if (nums.length == 1) {
            if (nums[0] == target) {
                return 0;
            } else {
                return -1;
            }
        }
        while (left < right) {
            if (nums[i] == target) {
                return i;
            }

            if (target > nums[middle] && target != nums[right]) {
                right--;
            }

            if (target < nums[middle] && target != nums[left]) {
                left++;
            }

            i++;
        }

        return -1;
    }
}
