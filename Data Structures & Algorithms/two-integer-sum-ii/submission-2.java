class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];

        int left = 0;
        int right = numbers.length - 1;
        int i = 0;
        while (i < numbers.length) {
            if (numbers[left] + numbers[right] > target) {
                right -= 1;
            } else if (numbers[left] + numbers[right] < target) {
                left += 1;
            } else {
                result[0] = left + 1;
                result[1] = right + 1;
            }

            i++;
        }

        return result;
    }
}
