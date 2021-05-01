public class solution552_dp {

    /*  转移 x = 'A','L','P'
        dp[i][2][3]
        当前是否有'A'以及最后有几个'L';
    */

    long mod = (long) 1e9 + 7;

    public int checkRecord(int n) {
        // 特判
        if (n == 0) return 0;
        if (n == 1) return 3;
        long[][][] dp = new long[n][2][3];
        //初始化
        //以L结尾(一个'L')
        dp[0][0][1] = 1;
        //含A，末尾无L(一个'A')
        dp[0][1][0] = 1;
        //不含A，末尾无L(一个'P')
        dp[0][0][0] = 1;
        for (int i = 1; i < n; i++) {
            // 状态转移，建议在纸上画出来，debug一下就知道是不是缺少状态
            dp[i][1][0] = (dp[i - 1][1][0] + dp[i - 1][0][0] + dp[i - 1][0][2] + dp[i - 1][0][1] + dp[i - 1][1][1] + dp[i - 1][1][2]) % mod;
            dp[i][1][1] = dp[i - 1][1][0];
            dp[i][1][2] = dp[i - 1][1][1];
            dp[i][0][1] = dp[i - 1][0][0];
            dp[i][0][2] = dp[i - 1][0][1];
            dp[i][0][0] = (dp[i - 1][0][0] + dp[i - 1][0][1] + dp[i - 1][0][2]) % mod;
        }
        long ans = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                // System.out.println("i" + i + "j" + j + ":" +dp[n - 1][i][j]);
                ans = (ans + dp[n - 1][i][j]) % mod;
            }
        }
        return (int)ans;
    }
}
