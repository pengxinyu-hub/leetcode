import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class solution15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list=new ArrayList<>();
        backtracking(0,nums,new ArrayList<>(),list,0);
        return list;
    }

    private void backtracking(int start,int[] nums,List<Integer> list,List<List<Integer>> res,int sum){
        if(list.size()==3){
            if(sum==0){
                res.add(new ArrayList<>(list));
            }
            return;
        }

        for(int i=start;i<nums.length;i++){
            if(i>start&&nums[i]==nums[i-1]) continue;
            list.add(nums[i]);
            backtracking(i+1,nums,list,res,sum+nums[i]);
            list.remove(list.size()-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(new solution15().threeSum(new int[]{-1,0,1,2,-1,-4}));
    }
}
