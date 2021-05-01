import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class solution15_better {
    public List<List<Integer>> threeSum(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> list=new ArrayList<>();
        List<List<Integer>> tuples=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            tuples=twoSum(nums,i+1,-nums[i]);
            for(List<Integer> tuple:tuples){
                tuple.add(nums[i]);
                list.add(tuple);
            }
            while (i<nums.length-1&&nums[i]==nums[i+1])  i++;
        }
        return list;
    }

    private List<List<Integer>> twoSum(int[] nums,int start,int target){
        List<List<Integer>> res=new ArrayList<>();
        int lo=start;
        int hi=nums.length-1;
        while (lo<hi){
            int sum=nums[lo]+nums[hi];
            int left=nums[lo];
            int right=nums[hi];
            if(target<sum)  hi--;
            else if(target>sum)  lo++;
            else {
                List<Integer> tuple=new ArrayList<>();
                tuple.add(nums[lo]);
                tuple.add(nums[hi]);
                res.add(tuple);
                while (lo<hi&&nums[lo]==left)  lo++;
                while(lo<hi&&nums[hi]==right)  hi--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new solution15().threeSum(new int[]{-1,0,1,2,-1,-4}));
    }
}
