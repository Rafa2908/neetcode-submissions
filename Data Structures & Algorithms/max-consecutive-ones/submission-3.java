class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxSeen = 0;
        int first = nums[0];
        int count = 0;

        for(int n : nums){

            if(n == 1){
                count++;
            } else {
                count=0;
            }

            maxSeen = Math.max(maxSeen, count);
        }

        return maxSeen;
    }
}