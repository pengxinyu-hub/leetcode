import java.util.Arrays;
import java.util.stream.Collectors;

public class solution338 {
    public int[] countBits(int num) {
        int[] dp=new int[num+1];
        dp[0]=0;
        for(int i=1;i<=num;i++){
            if(i%2==1)
                dp[i]=dp[i-1]+1;
            else if(i%2==0)
                dp[i]=dp[i/2];
        }
        return dp;
    }

    public static void main(String[] args) {
        int[] a=new solution338().countBits(5);
        for(int t:a){
            System.out.print(t+" ");
        }
    }
}
