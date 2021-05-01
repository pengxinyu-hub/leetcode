import java.util.Scanner;

public class solution300 {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) return 0;
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int ans=1;
        for (int i = 1; i < nums.length; i++) {
            int max = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (nums[i] > nums[j] && dp[j] > max) {
                    max = dp[j];
                }
            }
            dp[i] = max + 1;
            ans=Math.max(ans,dp[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] b=new int[n];
        for(int i=0;i<n;i++){
            b[i]=in.nextInt();
        }
        System.out.println(new solution300().lengthOfLIS(b));
    }
}