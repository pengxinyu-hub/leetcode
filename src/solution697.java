import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class solution697 {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, List<Integer>> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])) {
                map.put(nums[i], new ArrayList<>());
            }
            List a=map.get(nums[i]);
            a.add(i);
        }
        int max=0;
        for(int i:map.keySet()){
            if(map.get(i).size()>max){
                max=map.get(i).size();
            }
        }
        int ans=Integer.MAX_VALUE;
        for(int i:map.keySet()){
            if(map.get(i).size()==max){
                List<Integer> b=map.get(i);
                if(b.get(b.size()-1)-b.get(0)+1<ans)
                    ans=b.get(b.size()-1)-b.get(0)+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a={1, 2, 2, 3, 1};
        System.out.println(new solution697().findShortestSubArray(a));
    }
}
