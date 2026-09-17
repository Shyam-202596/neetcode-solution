/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int pivot = findPivot(mountainArr);
        if(mountainArr.get(pivot) == target){
            return pivot;
        }
        int index = binarySearch(mountainArr, target, 0, pivot, true);
        if(index != -1){
            return index;
        }
        return binarySearch(mountainArr, target, pivot + 1, mountainArr.length() - 1, false);        
    }
    private int binarySearch(MountainArray arr, int target, int s, int e, boolean isAscending){
        while(s <= e){
            int m = s + (e - s) / 2;
            if(arr.get(m) == target){
                return m;
            }
            if(isAscending){
                if(arr.get(m) > target){
                    e = m - 1;
                }else{
                    s = m + 1;
                }
            }else{
                if(arr.get(m) > target){
                    s = m + 1;
                }else{
                    e = m - 1;
                }
            }
        }
        return -1;
    }
    private int findPivot(MountainArray arr){
        int s = 0;
        int e = arr.length() - 1;
        while(s < e){
            int m = s + (e - s) / 2;
            if((m != arr.length() - 1) && arr.get(m) > arr.get(m + 1)){
                e = m;
            }
            if((m != arr.length() - 1) && arr.get(m) < arr.get(m + 1)){
                s = m + 1;
            }
        }
        return s;
    }
}