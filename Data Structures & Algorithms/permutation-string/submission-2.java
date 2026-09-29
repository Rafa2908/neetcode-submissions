class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        int left = 0;
        int right = 0;

        int[] patternCount = new int[26];
        int[] windowCount = new int[26];

        for (int n : arr1) {
            patternCount[n - 'a']++;
        }

        while (right < arr2.length) {
            windowCount[arr2[right] - 'a']++;
            right++;

            if (right - left == arr1.length) {
                if (Arrays.equals(patternCount, windowCount)) {
                    return true;
                }

                windowCount[arr2[left] - 'a']--;
                left++;
            }
        }
        return false;
    }
}