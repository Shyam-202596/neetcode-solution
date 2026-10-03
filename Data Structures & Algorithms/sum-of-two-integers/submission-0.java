class Solution {
    public int getSum(int a, int b) {
        int res = 0;
        int carry = 0;
        for(int i = 0; i < 32; i++){
            int bitA = (a >> i) & 1;
            int bitB = (b >> i) & 1;
            int sumBit = bitA ^ bitB ^ carry;
            res = res | (sumBit << i);
            carry = (bitA & bitB) | (bitA & carry) | (bitB & carry);
        }
        return res;
    }
}
