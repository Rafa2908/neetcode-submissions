class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //Create HashMap to store the frequency of numbers in the array nums
        HashMap<Integer, Integer> hash = new HashMap<>();

        for(int i=0; i < nums.length; i++){
            hash.put(nums[i], hash.getOrDefault(nums[i], 0) + 1);
        }

        //Create a Priority Queue using Comparator to store the number from nums and it's frequency in an array
        //The comparator will store the numbers from the highest priority to the lowest
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> b[1] - a[1]);

        //Store key:value pairs in PriorityQueue as an array consisting of [number, frequency]
        for(Integer num : hash.keySet()){
            pq.add(new int[]{num, hash.get(num)});
        }

        //Create an array with length k
        int[] result = new int[k];

        for(int i=0; i < k; i++){
            //Since Priority Queue has arrays of 2 elements inside [number, frequency]
            //The number with the highest frequency will be at the top so
            //We'll poll the k top elements from the queue
            result[i] = pq.poll()[0];
        }

        return result;


    }
}
