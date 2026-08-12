class Solution {

    public String encode(List<String> strs) {

        String encode = "";

        for(int i = 0; i < strs.size(); i++){
            encode += (strs.get(i).length()) + "#" + strs.get(i); 
        }

        return encode;

    }

    public List<String> decode(String str) {
        String encoded = str;

        List<String> words = new ArrayList<>();


        int i = 0;

        while(i < encoded.length()){
            //Declare variable to determine where the delimiter # is located using indexOf
            int delimiter = encoded.indexOf("#", i);

            //Declare variable to determine the length of the word by getting the length
            //appended to the delimiter & convert it to integer
            //substring(start, end(exclusive))
            int length = Integer.parseInt(encoded.substring(i, delimiter));

            String word = encoded.substring(delimiter +1 , delimiter + length + 1);

            words.add(word);

            i = delimiter + length + 1;
        }

        return words;
    }
}
