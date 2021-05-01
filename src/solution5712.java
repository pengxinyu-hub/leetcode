import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class solution5712 {
    public int getMaximumConsecutive(int[] coins) {
        int sum=0;
        for(int coin:coins){
            sum+=coin;
        }
        boolean[] visit=new boolean[sum+1];
        dfs(0,coins,0,new ArrayList<>(),visit);
        int ans=0;
        for(int i=0;i<visit.length;i++){
            if(!visit[i]) break;
            ans++;
        }
        return ans;
    }

    private void dfs(int start, int[] coins, int num, List<Integer> list,boolean[] visit){
        visit[num]=true;
        list.add(num);
        for(int i=start;i<coins.length;i++){
            dfs(i+1,coins,num+coins[i],list,visit);
        }
    }

    public static void main(String[] args) {
        System.out.println(new solution5712().getMaximumConsecutive(new int[]{1,4,10,3,1}));
    }
}
