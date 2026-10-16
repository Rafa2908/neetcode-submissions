class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] row = new HashSet[9];
        Set<Character>[] col = new HashSet[9];
        Set<Character>[] boxes = new HashSet[9];

        for (int k = 0; k < 9; k++) {
            row[k] = new HashSet<>();
            col[k] = new HashSet<>();
            boxes[k] = new HashSet<>();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int boxIndex = (i / 3) * 3 + (j / 3);

                if (board[i][j] == '.')
                    continue;

                if (row[i].contains(board[i][j]) || col[j].contains(board[i][j])
                    || boxes[boxIndex].contains(board[i][j])) {
                    return false;
                } else {
                    row[i].add(board[i][j]);
                    col[j].add(board[i][j]);
                    boxes[boxIndex].add(board[i][j]);
                }
            }
        }

        return true;
    }
}
