import java.util.ArrayList;
import java.util.List;

public class solution552 {
    private int ans=0;
    public int checkRecord(int n) {
        dfs(new ArrayList<>(),n,0,0);
        return ans%1000000007;
    }

    private void dfs(List<Integer> list, int limit, int Late, int AbsNum){
        if(list.size()==limit){
            ans++;
            return;
        }
        for(int i=0;i<3;i++){
            if(Late==2&&i==1) continue;
            if(AbsNum==1&&i==0)  continue;
            if(i==0){
                list.add(0);
                dfs(list,limit,0,AbsNum+1);
            }
            else if(i==1){
                list.add(1);
                dfs(list,limit,Late+1,AbsNum);
            }
            else if(i==2){
                list.add(2);
                dfs(list,limit,0,AbsNum);
            }
            list.remove(list.size()-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(new solution552().checkRecord(2));
    }
}
