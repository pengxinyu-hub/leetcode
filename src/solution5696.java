import java.util.Arrays;

public class solution5696 {
    public int countPairs(int[] nums, int low, int high) {
        Arrays.sort(nums);
        int ans=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if((nums[i]^nums[j])>=low&&(nums[i]^nums[j])<=high)
                    ans++;
            }
        }
        return ans;
    }
}
