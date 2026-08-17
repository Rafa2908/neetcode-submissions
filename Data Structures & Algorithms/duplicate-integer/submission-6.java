class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();

        for(Integer num : nums){
            if(hash.contains(num)){
                return true;
            } else {
                hash.add(num);
            }
        }

        return false;
    }
}