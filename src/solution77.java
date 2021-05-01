import java.awt.image.BandedSampleModel;
import java.util.*;

public class solution77 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> b=new ArrayList<>();
        dfs(ans,b,k,1,n);
        return ans;
    }

    private void dfs(List<List<Integer>> ans,List<Integer> list,int k,int start,int n){
        if(list.size()==k){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=start;i<=n;i++){
            list.add(i);
            dfs(ans,list,k,i+1,n);
            list.remove(list.size()-1);
        }
    }

    public static void main(String[] args) {
        solution77 solution77=new solution77();
        List<List<Integer>> a=solution77.combine(4,2);
        System.out.println(a);
    }
}
