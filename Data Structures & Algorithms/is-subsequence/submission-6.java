class Solution {
    public boolean isSubsequence(String s, String t) {
        int left=0;
        int right=0;

        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();


        while(right < arr2.length){

            if(s.isEmpty()) return true;

            if(arr1[left] == arr2[right]){
                left++;
                right++;
            } else {
                right++;
            }

            if(left == s.length()) return true;
        }

        return false;
        
    }
}