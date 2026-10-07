class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> window = new HashSet<>();
        int left = 0;
        int right = 0;
        char[] arr = s.toCharArray();
        int longest = 0;

        while (right < arr.length) {
            while (window.contains((arr[right]))) {
                window.remove(Character.valueOf(arr[left]));
                left++;
            }

            window.add(arr[right]);
            longest = Math.max(longest, window.size());
            right++;
        }

        return longest;
    }
}
