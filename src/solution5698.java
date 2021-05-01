public class solution5698 {
    public int minElements(int[] nums, int limit, int goal) {
        long sum=0L;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        long diff=Math.abs(goal-sum);
        int ans=(int)Math.ceil((double)diff/limit);
        return ans;
    }

    public static void main(String[] args) {
        int[] nums={0};
        System.out.println(new solution5698().minElements(nums,1000000,-1000000000));
    }
}
