class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n+1];
        for(int i = 0; i <= n; i++){
            int num = i;
            int c = 0;
            while(num > 0){
                if((num & 1) == 1){
                    c++;
                    num = num>>1;
                }else{
                    num = num>>1;
                }
            }
            res[i] = c;
        }
        return res;
    }
}
