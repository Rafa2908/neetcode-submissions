class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> num = new Stack<>();
        int result = 0;

        int i = 0;
        while (i < tokens.length) {
            if (tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*")
                || tokens[i].equals("/")) {
                int a = num.pop();
                int b = num.pop();

                switch (tokens[i]) {
                    case "+" -> result = (a + b);
                    case "-" -> result = (b - a);
                    case "*" -> result = (a * b);
                    case "/" -> result = (b / a);
                }

                num.push(result);
            } else {
                num.push(Integer.parseInt(tokens[i]));
            }

            i++;
        }

        return num.pop();
    }
}
