import java.util.ArrayList;
import java.util.List;

public class solution216 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> list=new ArrayList<>();
        dfs(1,k,n,new ArrayList<>(),list);
        return list;
    }

    private void dfs(int start,int k,int n,List<Integer> cur,List<List<Integer>> res){
        if(n<0)
            return;
        if(cur.size()==k){
            if(n==0){
                res.add(new ArrayList<>(cur));
            }
            return;
        }

        for(int i=start;i<=Math.min(9,n);i++){
            cur.add(i);
            dfs(i+1,k,n-i,cur,res);
            cur.remove(cur.size()-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(new solution216().combinationSum3(3,9));
    }

}
