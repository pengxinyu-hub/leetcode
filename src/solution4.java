public class solution4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length1=nums1.length;
        int length2=nums2.length;
        int[] nums=new int[length1+length2];
        int i=0;
        int j=0;
        for(int k=0;k<nums.length;k++){
            if(j>=length2)  nums[k]=nums1[i++];
            else if(i>=length1)  nums[k]=nums2[j++];
            else if(nums2[j]<nums1[i])  nums[k]=nums2[j++];
            else nums[k]=nums1[i++];
        }
        if(nums.length%2==1){
            return nums[nums.length/2];
        }
        else {
            return (double) (nums[nums.length/2]+nums[nums.length/2-1])/2;
        }
    }

    public static void main(String[] args) {
        int[] nums1={1,3,5,7};
        int[] nums2={2,4,5};
        System.out.println(new solution4().findMedianSortedArrays(nums1,nums2));
    }
}
