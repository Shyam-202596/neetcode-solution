class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int ROWS = matrix.length;
        int COLS = matrix[0].length;
        int s = 0;
        int e = ROWS * COLS - 1;
        while(s <= e){
            int m = s + (e - s) / 2;
            int r = m / COLS;
            int c = m % COLS;
            if(target == matrix[r][c]){
                return true;
            }
            if(target > matrix[r][c]){
                s = m + 1;
            }else{
                e = m - 1;
            }
        }
        return false;
    }
}
