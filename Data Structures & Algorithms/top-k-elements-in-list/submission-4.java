class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] buckets = new ArrayList[nums.length + 1];

        for (int key : freq.keySet()) {
            int value = freq.get(key);
            if (buckets[value] == null) {
                buckets[value] = new ArrayList<>();
            }

            buckets[value].add(key);
        }

        int i = nums.length;

        int[] result = new int[k];

        int count = 0;

        while (i >= 1 && k > count) {
            if (buckets[i] != null) {
                for (int n : buckets[i]) {
                    if (count == k)
                        break;
                    result[count] = n;
                    count++;
                }
            }

            i--;
        }

        return result;
    }
}
