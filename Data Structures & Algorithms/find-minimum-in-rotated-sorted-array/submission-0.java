class Solution {
    public int findMin(int[] nums) {
        /*int n = nums.length;
        if(nums[0] < nums[n-1]){
            return nums[0];
        } */
        int s = 0;
        int e = nums.length - 1;
        while(s <= e){
            int m = s + (e - s) / 2;
            if(m < nums.length - 1 && nums[m] > nums[m + 1]){
                return nums[m + 1];
            }
            if(m > 0 && nums[m] < nums[m - 1]){
                return nums[m];
            }
            if(nums[m] < nums[s]){
                e = m - 1;
            }else{
                s = m + 1;
            }
        }
        return nums[0];
    }
}
