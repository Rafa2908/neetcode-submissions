class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hash = new HashMap<>();
        for(int i=0; i < strs.length; i++){
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            String key = new String(c);

            if(hash.containsKey(key)){
                hash.get(key).add(strs[i]);
            } else {
                List<String> w = new ArrayList<>();
                w.add(strs[i]);
                hash.put(key, w);
            }
        }

        return new ArrayList<>(hash.values());
    }
}
