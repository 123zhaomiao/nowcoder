class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        int [] dp = new int[11];
        dp[0] = 1;
        int res = 1;
        for (int i = 1 ;i <= n; i++){
            dp[i] = dp[i-1] + 9 * res;
            res *= 10 - i;
        }
        return dp[n];
    }
}
