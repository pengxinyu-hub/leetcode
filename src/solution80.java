public class solution80 {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums)
            if (i < 2 || n > nums[i-2])
                nums[i++] = n;
        return i;
    }

    public static void main(String[] args) {
        System.out.println(new solution80().removeDuplicates(new int[]{0,0,1,1,1,1,2,3,3}));
    }
}
