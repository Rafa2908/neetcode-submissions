class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();

        if (s.length() == 1) {
            return false;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!stack.empty()
                && (arr[i] == ')' && stack.peek() == '(' || arr[i] == '}' && stack.peek() == '{'
                    || arr[i] == ']' && stack.peek() == '[')) {
                stack.pop();
            } else {
                stack.push(arr[i]);
            }
        }

        if (!stack.empty()) {
            return false;
        }

        return stack.empty();
    }
}