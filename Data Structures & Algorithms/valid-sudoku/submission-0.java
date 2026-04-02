class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();
        
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char current = board[r][c];
                
                // Skip empty cells
                if (current == '.') continue;
                
                // Create unique identifiers for row, column, and square
                String rowKey = current + " in row " + r;
                String colKey = current + " in col " + c;
                String squareKey = current + " in square " + (r / 3) + "-" + (c / 3);
                
                // If any duplicate is found, return false
                if (!seen.add(rowKey) || !seen.add(colKey) || !seen.add(squareKey)) {
                    return false;
                }
            }
        }
        
        return true;
    }
}
//continue means go to next loop iteration
//study bit mask
