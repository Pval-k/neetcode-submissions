class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> hash = new HashSet<>();
        for(int r = 0; r < board.length; r++){
            for(int c = 0; c < board[0].length; c++){
                char current = board[r][c];

                if(current == '.'){
                    continue;
                }

                String row = current + "is in row" + r;
                String col = current + "is in col" + c;
                String square = current + "is in square" + r/3 + "-" + c/3;

                if(!hash.contains(row) && !hash.contains(col) && !hash.contains(square)){
                    hash.add(row);
                    hash.add(col);
                    hash.add(square);
                }
                else{
                    return false;
                }

            }
        }
        return true;
    }
}
