import java.util.Arrays;

public class solution217 {
    public boolean containsDuplicate(int[] nums) {
        long a= Arrays.stream(nums).distinct().count();
        return nums.length!=a;
    }

    public static void main(String[] args) {
        int[] a={1,2,3,4};
        System.out.println(new solution217().containsDuplicate(a));
    }

}
