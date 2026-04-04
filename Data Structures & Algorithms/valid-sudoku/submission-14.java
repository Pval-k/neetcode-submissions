class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> hash = new HashSet<>();
        for(int r = 0; r < board.length; r++){
            for(int c = 0; c < board[0].length; c++){
                char current = board[r][c];
                if(current == '.'){
                    continue;
                }

                String row = current + "Row" + r;
                String col = current + "Col" + c;
                String square = current + "Square" + r/3 + "-" + c/3;

                if(hash.contains(row) || hash.contains(col) || hash.contains(square)){
                    return false;
                }
                else{
                    hash.add(row);
                    hash.add(col);
                    hash.add(square);
                }
            }
        }
        return true;
    }
}
