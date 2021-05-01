import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class solution90 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        dfs(res,new ArrayList<>(),0,nums);
        return res;
    }

    public void dfs(List<List<Integer>> ans,List<Integer> cur,int start,int[] nums){
        ans.add(new ArrayList<>(cur));
        for(int i=start;i<nums.length;i++){
            if(i>start&&nums[i]==nums[i-1])
                continue;
            cur.add(nums[i]);
            dfs(ans,cur,i+1,nums);
            cur.remove(cur.size()-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(new solution90().subsetsWithDup(new int[]{1,2,2}));
    }
}
