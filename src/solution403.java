import java.util.*;

public class solution403 {
    public boolean canCross(int[] stones) {
        if(stones[1]!=1) return false;
        Set<Integer>[] dp=new Set[stones.length];
        dp[1]=Set.of(1);
        for(int i=2;i<stones.length;i++){
            Set<Integer> set=new HashSet<>();
            for(int j=i-1;j>=1;j--){
                int diff=stones[i]-stones[j];
                for(int k:dp[j]){
                    if(k==diff||k==diff-1||k==diff+1)
                        set.add(diff);
                }
            }
            dp[i]=set;
        }
        return !dp[stones.length-1].isEmpty();
    }

    public static void main(String[] args) {
        int[] b={0,1,3,5,6,8,12,17};
        System.out.print(new solution403().canCross(b));
    }
}
