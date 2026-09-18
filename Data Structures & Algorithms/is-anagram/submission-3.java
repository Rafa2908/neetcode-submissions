class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        HashMap<Character,Integer> hash = new HashMap<>();

        for(int i = 0; i < arr1.length;i++){
            if(hash.containsKey(arr1[i])){
                hash.put(arr1[i], hash.get(arr1[i])+1);
            } else {
                hash.put(arr1[i], 1);
            }

        }

        for(int i = 0; i < arr2.length;i++){
            if(hash.containsKey(arr2[i])){
                hash.put(arr2[i], hash.get(arr2[i])-1);
            } else {
                hash.put(arr2[i], 1);
            }

        }

        for(int num : hash.values()){
            if(num != 0){
                return false;
            }
        }

        return true;
    }
}
