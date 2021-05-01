public class solution41 {
    public int firstMissingPositive(int[] nums){
        if(nums.length==0)  return 1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0&&nums[i]<=nums.length&&nums[i]!=nums[nums[i]-1]){
                int temp=nums[nums[i]-1];
                nums[nums[i]-1]=nums[i];
                nums[i]=temp;
                i--;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1)
                return i+1;
        }
        return nums.length+1;
    }

    public static void main(String[] args) {
        System.out.println(new solution41().firstMissingPositive(new int[]{1,1}));
    }
}
