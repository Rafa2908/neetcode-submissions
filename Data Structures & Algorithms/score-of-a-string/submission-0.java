class Solution {
    public int scoreOfString(String s) {
        int sum = 0;
        int move = 1;
        char[] arr = s.toCharArray();

        int i = 0;
        while (move + i < arr.length) {
            sum += Math.abs((int)arr[move + i] - (int)arr[i]);
            System.out.println(sum);
            i++;
        }

        return sum;
    }
}