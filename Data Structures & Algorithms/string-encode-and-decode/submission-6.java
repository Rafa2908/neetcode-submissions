class Solution {
    public String encode(List<String> strs) {
        String word = "";

        for (String w : strs) {
            word += w.length() + "#" + w;
        }

        return word;
    }

    public List<String> decode(String str) {
        String code = str;

        List<String> words = new ArrayList<>();

        int i = 0;

        while (i < code.length()) {
            int delimiter = code.indexOf("#", i);
            int length = Integer.parseInt(code.substring(i, delimiter));
            int end = length + delimiter + 1;

            String word = code.substring(delimiter + 1, end);

            words.add(word);

            i = end;
        }

        return words;
    }
}
