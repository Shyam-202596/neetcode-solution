class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        while (top <= bottom && left <= right) {
            // Top row: left to right
            for (int col = left; col <= right; col++) {
                list.add(matrix[top][col]);
            }
            top++;

            // Right column: top to bottom
            for (int row = top; row <= bottom; row++) {
                list.add(matrix[row][right]);
            }
            right--;

            // Bottom row: right to left
            if (top <= bottom) {
                for (int col = right; col >= left; col--) {
                    list.add(matrix[bottom][col]);
                }
                bottom--;
            }

            // Left column: bottom to top
            if (left <= right) {
                for (int row = bottom; row >= top; row--) {
                    list.add(matrix[row][left]);
                }
                left++;
            }
        }

        return list;
    }
}
