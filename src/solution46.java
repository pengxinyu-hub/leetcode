import java.util.ArrayList;
import java.util.List;

public class solution46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        boolean[] visit=new boolean[nums.length];
        dfs(visit,new ArrayList<>(),list,nums);
        return list;
    }

    private void dfs(boolean[] visit,List<Integer> choose,List<List<Integer>> ans,int[] nums){
        if(choose.size()==nums.length){
            ans.add(new ArrayList<>(choose));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(visit[i])  continue;
            visit[i]=true;
            choose.add(nums[i]);
            dfs(visit,choose,ans,nums);
            visit[i]=false;
            choose.remove(choose.size()-1);
        }

    }

    public static void main(String[] args) {
        System.out.println(new solution46().permute(new int[]{1,2,3}));
    }
}
