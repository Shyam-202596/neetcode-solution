class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int ROWS = matrix.length;
        int COLS = matrix[0].length;
        if(target < matrix[0][0] || target > matrix[ROWS - 1][COLS - 1]){
            return false;
        }
        int top = 0;
        int bot = ROWS - 1;
        int row = -1;
        while(top <= bot){
            int m = top + (bot - top) / 2;
            if(target == matrix[m][COLS - 1] || target == matrix[m][0]){
                return true;
            }
            if(target > matrix[m][COLS - 1]){
                top = m + 1;
            }
            else if(target < matrix[m][0]){
                bot = m - 1;
            }
            else{
                row = m;
                break;
            }
        }
        if(row == -1){
            return false;
        }
        int s = 0;
        int e = COLS - 1;
        while(s <= e){
            int m = s + (e - s) / 2;
            if(target == matrix[row][m]){
                return true;
            }
            if(target > matrix[row][m]){
                s = m + 1;
            }else{
                e = m - 1;
            }
        }
        return false;
    }
}
