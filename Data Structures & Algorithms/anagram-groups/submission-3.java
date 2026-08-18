class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> hash = new HashMap<>();

        for(int i = 0; i < strs.length; i++){
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            String w = new String(c);

            if(hash.containsKey(w)){
                hash.get(w).add(strs[i]);
            } else {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                hash.put(w, list);
            }
        }

        return new ArrayList<>(hash.values());

    }
}
