public class solution837 {
    public double new21Game(int N, int K, int W) {
        if(K==0)  return 1.0;
        if(N-K+2>W) return 1.0;
        double p=(double) 1/W;
        double[] dp=new double[N+2];
        dp[0]=1.0;
        for(int i=1;i<=K-1;i++){
            double sum=0.0;
            for(int j=1;j<=Math.min(i,W);j++){
                sum+=dp[i-j]*p;
            }
            dp[i]=sum;
        }

        for(int i=Math.max(N+1-W,0);i<=K-1;i++){
            dp[N+1]+=dp[i]*p*(W-(N+1-i)+1);
        }

        return 1-dp[N+1];
    }
}
