class Solution {

    public String encode(List<String> strs) {
        String word = "";

        for(String w: strs){
            word += w.length() + "#" + w;
        }

        return word;
    }

    public List<String> decode(String str) {
        String coded = str;
        List<String> words = new ArrayList<>();

        int i = 0;
        while(i < coded.length()){

            int delimeter = coded.indexOf("#", i);
            int length = Integer.parseInt(coded.substring(i, delimeter));
            int end = delimeter + length + 1;
            String word = coded.substring(delimeter+1, end);
            words.add(word);
            i = end;
        }

        return words;
        
    }
}
