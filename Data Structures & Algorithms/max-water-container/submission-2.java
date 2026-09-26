class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int water = 0;

        while(left <= right){
            int height = Math.min(heights[left], heights[right]);
            int width = right - left;
            int area = height * width;
            water = Math.max(water, area);

            if(heights[left] < heights[right]){
                left++;
            } else {
                right--;
            }
        }

        return water;
    }
}
