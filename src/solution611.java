
import java.util.Arrays;

public class solution611 {
    public int triangleNumber(int[] nums) {
        int cnt=0;
        Arrays.sort(nums);
        for(int i=nums.length-1;i>=2;i--){
            int start=0;
            int end=i-1;
            while (start<end){
                if(nums[start]+nums[end]>nums[i]){
                    cnt+=(end-start);
                    end--;
                }
                else {
                    start++;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] a={2,2,3,4};
        System.out.println(new solution611().triangleNumber(a));
    }

}
