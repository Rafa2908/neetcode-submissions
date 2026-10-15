class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hash = new HashMap<>();
        List<List<String>> words = new ArrayList<>();

        for (String word : strs) {
            int[] freq = new int[26];
            for (int i = 0; i < word.length(); i++) {
                freq[word.charAt(i) - 'a']++;
            }

            StringBuilder freqString = new StringBuilder();

            for (int j = 0; j < freq.length; j++) {
                freqString.append(freq[j]).append('#');
            }

            String key = freqString.toString();

            if (hash.containsKey(key)) {
                hash.get(key).add(word);
            } else {
                hash.put(key, new ArrayList<>());
                hash.get(key).add(word);
            }
        }

        for (List<String> l : hash.values()) {
            words.add(l);
        }

        return words;
    }
}
