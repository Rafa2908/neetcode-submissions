class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int water = 0;
        int leftMax = 0;
        int rightMax = 0;

        while(left < right){
            leftMax = Math.max(leftMax, height[left]); //2
            rightMax = Math.max(rightMax, height[right]); //1

            if(leftMax <= rightMax){
                if(leftMax > height[left]){
                    water += leftMax - height[left];
                }
                left++;
            } else {
                if(rightMax > height[right]){
                    water += rightMax - height[right];
                }
                right--;
            }
        }

        return water;
    }
}
