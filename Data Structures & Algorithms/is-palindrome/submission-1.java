class Solution {
    public boolean isPalindrome(String s) {
        String word = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversedWord = "";
        for(int i = 0; i < word.length(); i++){
            char[] c = word.toCharArray();
            String w = new String(c);
            String r = new StringBuilder(w).reverse().toString();
            reversedWord = r;
        }

        return word.equals(reversedWord);
    }
}
