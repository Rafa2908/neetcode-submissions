class Solution {
    public boolean isPalindrome(String s) {
        char[] words = (s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase()).toCharArray();

        int left = 0;
        int right = words.length - 1;

        while (left < right) {
            if (words[left] == (words[right])) {
                left++;
                right--;
            } else {
                return false;
            }
        }

        return true;
    }
}
