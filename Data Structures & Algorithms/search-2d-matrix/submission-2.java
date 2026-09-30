class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = 0;
        int r = matrix.length;
        int col = -1;

        while(l<r){
            int m = l + (r-l)/2;
            if(matrix[m][0] <=target && matrix[m][matrix[0].length-1] >= target){
                 col = m;
                 break;
            } else if(matrix[m][0] < target){
                l = m+1;
            } else {
                r = m;
            }
        }

        if(col == -1){
            return false;
        }

        l = 0;
        r = matrix[0].length;
        int row = -1;

        while(l<r){
            int m = l + (r-l)/2;
            if(matrix[col][m] ==target){
                 row = m;
                 break;
            } else if(matrix[col][m] < target){
                l = m+1;
            } else {
                r = m;
            }
        }

        if(row == -1){
            return false;
        } else {
            return true;
        }

    }
}
