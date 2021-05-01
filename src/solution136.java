public class solution136 {
    public int singleNumber(int[] nums) {
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i]^nums[i-1];
        }
        return nums[nums.length-1];
    }

    public static void main(String[] args) {
        int[] a={1,2,2,8,8};
        System.out.println(new solution136().singleNumber(a));
    }
}
