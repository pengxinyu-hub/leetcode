import java.util.ArrayList;
import java.util.List;

public class solution40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
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
            cur.add(candidates[i]);
            backtracking(i+1,ans,cur,target-candidates[i],candidates);
            cur.remove(cur.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] a={10,1,2,7,6,1,5};
        System.out.println(new solution39().combinationSum(a,8));
    }
}
