class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] c = s.toCharArray();

        for (int i = 0; i < c.length; i++) {
            if (c[i] == '[' || c[i] == '{' || c[i] == '(') {
                stack.push(c[i]);
            }

            if (c[i] == ']' || c[i] == '}' || c[i] == ')') {
                if (!stack.isEmpty()
                    && (stack.peek() == '[' && c[i] == ']' || stack.peek() == '{' && c[i] == '}'
                        || stack.peek() == '(' && c[i] == ')')) {
                    stack.pop();
                } else {
                    return false;
                }
            } 
        }

        return stack.isEmpty();
    }
}
