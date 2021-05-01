import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class solution39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        boolean[] marked=new boolean[candidates.length];
        Arrays.sort(candidates);
        backtracking(0,ans,new ArrayList<>(),target,candidates);
        return ans;
    }

    private void backtracking(int start,List<List<Integer>> ans,List<Integer> cur,int target,int[] candidates){
        if(target<0)
            return;

        if(target==0){
            ans.add(new ArrayList<>(cur));
            return;
        }

        for(int i=start;i<candidates.length;i++){
            if(i>start&&candidates[i-1]==candidates[i])  continue;
            cur.add(candidates[i]);
            backtracking(i+1,ans,cur,target-candidates[i],candidates);
            cur.remove(cur.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] a={1,1,6,7};
        System.out.println(new solution39().combinationSum(a,8));
    }
}
