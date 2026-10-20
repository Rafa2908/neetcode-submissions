class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;
        int left = 0;
        int right = heights.length - 1;

        while (left < right) {
            int h = Math.min(heights[left], heights[right]);
            int w = right - left;
            int currentArea = h * w;

            maxArea = Math.max(maxArea, currentArea);

            if (heights[left] > heights[right]) {
                right--;
            } else if (heights[left] < heights[right]) {
                left++;
            } else {
                left++;
            }
        }

        return maxArea;
    }
}

