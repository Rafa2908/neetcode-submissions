class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        HashMap<Character, Integer> freq = new HashMap<>();

        for(char w : arr1){
            freq.put(w, freq.getOrDefault(w, 0)+1);
        }

        for(int i = 0; i < arr2.length; i++){
            if(freq.containsKey(arr2[i])){
                freq.put(arr2[i], freq.get(arr2[i])-1);
            } else {
                freq.put(arr2[i], freq.getOrDefault(arr2[i], 0)+1);
            }
        }

        for(int num : freq.values()){
            if(num != 0) return false;
        }

        return true;
        
    }
}
