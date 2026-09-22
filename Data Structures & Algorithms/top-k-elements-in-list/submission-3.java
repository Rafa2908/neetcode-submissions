class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        HashMap<Integer, Integer> hash = new HashMap<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[1] - a[1]);

        for (int num : nums) {
            hash.put(num, hash.getOrDefault(num, 0) + 1);
        }

        for (Integer num : hash.keySet()) {
            pq.add(new int[] {num, hash.get(num)});
        }

        for (int i = 0; i < result.length; i++) {
            result[i] = pq.poll()[0];
        }

        return result;
    }
}
