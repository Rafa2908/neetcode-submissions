class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> hash = new HashMap<>();
        int i = 0;

        hash.put(0, 1);

        int sum = 0;
        int length = 0;
        while (i < nums.length) {
            sum += nums[i];
            if (hash.containsKey(sum - k)) {
                length += hash.get(sum-k);
            }
            hash.put(sum, hash.getOrDefault(sum, 0) + 1);

            i++;
        }

        return length;
    }
}