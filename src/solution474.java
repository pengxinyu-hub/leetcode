public class solution474 {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp=new int[m+1][n+1];
        for(String s:strs) {
            int[] a=num1and0(s);
            for (int i = m; i >= a[0]; i--) {
                for (int j = n; j >= a[1]; j--) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - a[0]][j - a[1]] + 1);
                }
            }
        }
        return dp[m][n];
    }

    private int[] num1and0(String s){
        int[] ans=new int[2];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0')
                ans[0]++;
            else if(s.charAt(i)=='1')
                ans[1]++;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new solution474().findMaxForm(new String[]{"10", "0001", "111001", "1", "0"},5,3));
    }
}
