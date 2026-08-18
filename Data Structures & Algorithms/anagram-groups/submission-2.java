class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> hash = new HashMap<>();
        List<List<String>> l = new ArrayList<>();
        String[] sortedArr = new String[strs.length];

        for(int i = 0; i < strs.length; i++){
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            String w = new String(c);
            sortedArr[i] = w;
        }

        for(int i = 0; i < sortedArr.length; i++){
            if(hash.containsKey(sortedArr[i])){
                hash.get(sortedArr[i]).add(strs[i]);
            } else {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                hash.put(sortedArr[i], list);
            }
        }

        for(List value : hash.values()){
            l.add(value);
        }
        return l;

    }
}
