class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");

        int l = 0;
        
        for(int i = 0; i < words.length; i++){
            l = words[words.length-1].length();
        }

        return l;
    }
}