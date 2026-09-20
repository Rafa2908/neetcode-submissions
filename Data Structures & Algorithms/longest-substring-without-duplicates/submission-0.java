class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int longest = 0;

        char[] arr = s.toCharArray();
        ArrayList<Character> window = new ArrayList<>();

        while(right < arr.length){
            while(window.contains(arr[right])){
                window.remove(Character.valueOf(arr[left]));
                left++;
            }
            
            window.add(arr[right]);
            longest = Math.max(longest,window.size());
            
            right++;
        }

        return longest;
    }
}