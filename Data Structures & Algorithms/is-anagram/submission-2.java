class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> hash = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (hash.containsKey(s.charAt(i))) {
                hash.put(s.charAt(i), hash.get(s.charAt(i)) + 1);
            } else {
                hash.put(s.charAt(i), 1);
            }
        }

        for (int j = 0; j < t.length(); j++) {
            char c = t.charAt(j);
            if (!hash.containsKey(c)) {
                return false;
            }
            hash.put(c, hash.get(c) - 1);
        }

        for (int value : hash.values()) {
            if (value != 0) {
                return false;
            }
        }

        return true;
    }
}