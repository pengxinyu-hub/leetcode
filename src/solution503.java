public class solution503 {
    public int[] nextGreaterElements(int[] nums) {
        int[] nums2=new int[nums.length*2];
        for(int i=0;i<2*nums.length;i++){
            nums2[i]=nums[i%nums.length];
        }
        int[] res=new int[nums.length];
        for(int j=0;j<nums.length;j++){
            res[j]=-1;
            for(int i=j+1;i<nums2.length;i++){
                if(nums2[i]>nums[j]){
                    res[j]=nums2[i];
                    break;
                }
            }
        }
        return res;
    }
}
