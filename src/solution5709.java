public class solution5709 {
    public int maxAscendingSum(int[] nums) {
        int ans=nums[0];
        int cur=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                cur+=nums[i];
            }
            else{
                cur=nums[i];
            }

            if(cur>ans)
                ans=cur;
        }
        return ans;
    }
}
