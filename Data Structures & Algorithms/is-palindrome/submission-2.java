class Solution {
    public boolean isPalindrome(String s) {
        String res = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int start = 0;
        int end = res.length() - 1;
        while(start < end){
            if(res.charAt(start) != res.charAt(end)){
                return false;
            }else{
                start++;
                end--;
            }
        }
        return true;
    }
}
