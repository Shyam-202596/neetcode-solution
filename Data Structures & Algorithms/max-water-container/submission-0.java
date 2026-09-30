class Solution {
    public int maxArea(int[] heights) {
        int max = Integer.MIN_VALUE;
        int i = 0;
        int j = heights.length - 1;
        while(i < j){
            int width = j - i;
            int height = Math.min(heights[i], heights[j]);
            int water = width * height;
            if(max < water){
                max = water;
            }
            if(heights[i] < heights[j]){
                i++;
            }else{
                j--;
            }
        }
        return max;
    }
}
