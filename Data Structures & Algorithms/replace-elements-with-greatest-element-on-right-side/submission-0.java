class Solution {
    public int[] replaceElements(int[] arr) {
        int maxValue = -1;

        for(int i = arr.length-1; i >= 0; i--){
            int current = arr[i];
            if(current > maxValue){
                arr[i] = maxValue;
                maxValue = current;
            } else {
                arr[i] = maxValue;
            }

        }

        return arr;

    }
}