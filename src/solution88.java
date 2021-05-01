import java.util.Arrays;

public class solution88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ans=new int[m+n];
        int i=0;
        int j=0;
        for(int k=0;k<m+n;k++){
            if(i==m){
                ans[k]=nums2[j++];
                continue;
            }
            if(j==n){
                ans[k]=nums1[i++];
                continue;
            }
            if(nums1[i]<nums2[j]){
                ans[k]=nums1[i++];
                continue;
            }
            if(nums1[i]>=nums2[j]){
                ans[k]=nums2[j++];
                continue;
            }
        }
        for(int o=0;o<m+n;o++){
            nums1[o]=ans[o];
        }
    }

    public static void main(String[] args) {
        int []nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        merge(nums1,m,nums2,n);
        Arrays.stream(nums1).forEach(System.out::println);
    }
}
