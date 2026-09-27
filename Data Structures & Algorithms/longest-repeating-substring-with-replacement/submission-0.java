class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int right = 0;
        int longest = 0;
        int maxFreq = 0;
        int[] count = new int[26];
        char[] arr = s.toCharArray();

        while(right < arr.length){
            count[arr[right]-'A']++;

            maxFreq = Math.max(maxFreq, count[arr[right]-'A']);

            while((right - left + 1) - maxFreq > k){
                count[arr[left]-'A']--;
                left++;
            }

            longest = Math.max(longest, (right - left + 1));
            right++;
        }

        return longest;
    }
}
