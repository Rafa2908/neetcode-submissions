class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int left = 1;
        int right = 1;

        for(int i = 0; i < nums.length; i++){
            result[i] = left;
            left = left * nums[i];
        }

        for(int j = nums.length-1; j >= 0; j--){
            result[j] = result[j] * right;
            right = right * nums[j];
        }

        return result;
    }
}  
