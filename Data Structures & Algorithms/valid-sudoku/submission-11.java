class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();
        for(int r = 0; r < board.length; r++){
            for(int c = 0; c < board[0].length; c++){
                char current = board[r][c];
                if(current =='.'){
                    continue;
                }
                String rowKey = current + "in row" + r;
                String colKey = current + "in col" + c;
                String squareKey = current + "in square" + r/3 + "-" + c/3;

                if(seen.contains(rowKey) || seen.contains(colKey) || seen.contains(squareKey)){
                    return false;
                }
                else{
                    seen.add(rowKey);
                    seen.add(colKey);
                    seen.add(squareKey);
                }
            }
        } 
        return true;
    }
}
