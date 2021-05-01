/**
 * 滑动窗口，保证
 * 窗口内的数字和始终大于等于target
 */
public class solution209 {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0;
        int start=0;
        int min=Integer.MAX_VALUE;
        for(int i=start;i<nums.length;i++){
            sum+=nums[i];
            while (sum>=target){
                if(i-start+1<min){
                    min=i-start+1;
                }
                sum-=nums[start];
                start++;
            }
        }
        if(min==Integer.MAX_VALUE) return 0;
        return min;
    }

    public static void main(String[] args) {
        int[] a={1,4,4};
        System.out.println(new solution209().minSubArrayLen(4,a));
    }
}
