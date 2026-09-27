class Solution {
    public int search(int[] nums, int target) {
        int p = findPivot(nums);
        if(p < 0){
            return binarySearch(nums, 0, nums.length - 1, target);
        }else{
            if(target >= nums[0]){
                return leftSearch(nums, 0, p, target);
            }else{
                return rightSearch(nums, p+1, nums.length-1, target);
            }
        }
    }
    int findPivot(int[] nums){
        int s = 0;
        int e = nums.length - 1;
        while(s <= e){
            int m = s + (e - s) / 2;
            if(m < nums.length - 1 && nums[m] > nums[m + 1]){
                return m;
            }
            if(m > 0 && nums[m] < nums[m - 1]){
                return m - 1;
            }
            if(nums[m] > nums[s]){
                s = m + 1;
            }else{
                e = m - 1;
            }
        }
        return -1;
    }
    int binarySearch(int[] nums, int start, int end, int target){
        int s = start;
        int e = end;
        while(s <= e){
            int m = s + (e - s) / 2;
            if(target == nums[m]){
                return m;
            }
            if(target > nums[m]){
                s = m + 1;
            }else{
                e = m - 1;
            }
        }
        return -1;
    }
    int leftSearch(int[] nums, int start, int end, int target){
        int s = start;
        int e = end;
        while(s <= e){
            int m = s + (e - s) / 2;
            if(target == nums[m]){
                return m;
            }
            if(target > nums[m]){
                s = m + 1;
            }else{
                e = m - 1;
            }
        }
        return -1;
    }
    int rightSearch(int[] nums, int start, int end, int target){
        int s = start;
        int e = end;
        while(s <= e){
            int m = s + (e - s) / 2;
            if(target == nums[m]){
                return m;
            }
            if(target > nums[m]){
                s = m + 1;
            }else{
                e = m - 1;
            }
        }
        return -1;
    }
}
