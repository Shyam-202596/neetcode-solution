class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int s = 1;
        int e = findMax(piles);
        
        while(s <= e){
            long hoursTaken = 0;
            int m = s + (e - s) / 2;
            for(int pile : piles){
                hoursTaken += (pile + m - 1) / m;
            }
            if(hoursTaken > h){
                s = m + 1;
            }
            if(hoursTaken <= h){
                e = m - 1;
            }
        }
        return s;
    }
    private int findMax(int[] piles){
        int max = piles[0];
        for(int x : piles){
            max = Math.max(max, x);
        }
        return max;
    }
}
