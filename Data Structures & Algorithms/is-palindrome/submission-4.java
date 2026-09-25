class Solution {
    public boolean isPalindrome(String s) {
        char[] arr = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().toCharArray();

        int left = 0;
        int right = arr.length - 1;

        System.out.println(Arrays.toString(arr));

        while(left < right){
            if(arr[left] == arr[right]){
                left++;
                right--;
            } else {
                return false;
            }
        }

        return true;
    }
}
