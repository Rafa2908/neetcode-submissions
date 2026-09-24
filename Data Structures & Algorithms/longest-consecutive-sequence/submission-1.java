class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hash = new HashSet<>();

        int longest = 0;

        for (int num : nums) {
            hash.add(num);
        }

        for (int i = 0; i < nums.length; i++) {
            if (!hash.contains(nums[i] - 1)) {
                int len = 1;

                while (hash.contains(nums[i] + len)) {
                    len++;
                }
                longest = Math.max(longest, len);
            }
        }

        return longest;
    }
}
