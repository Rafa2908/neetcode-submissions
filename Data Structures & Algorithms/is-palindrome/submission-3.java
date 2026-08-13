class Solution {
    public boolean isPalindrome(String s) {
        String word = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        char[] c = word.toCharArray();

        int left = 0;
        int right = c.length - 1;

        while(left < right){
            if(c[left] == c[right]){
                right -= 1;
                left += 1;
            } else {
                return false;
            }

        }
        return true;
    }

}
