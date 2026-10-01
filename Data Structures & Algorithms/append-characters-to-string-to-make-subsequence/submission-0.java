class Solution {
    public int appendCharacters(String s, String t) {
        int left = 0;
        int right = 0;
        int count = 0;

        if(s.isEmpty()) return 0;

        while(left < s.length() && right < t.length()){
            if(s.charAt(left) == t.charAt(right)){
                left++;
                right++;
            } else {
                left++;
            }

            count = t.length() - right;
        }

        return count;
    }
}