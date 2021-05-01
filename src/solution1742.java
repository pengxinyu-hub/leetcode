import java.util.Arrays;

public class solution1742 {
    public int countBalls(int lowLimit, int highLimit) {
        int[] a=new int[highLimit+1];
        for(int i=lowLimit;i<=highLimit;i++){
            a[getSum(i)]++;
        }
        return Arrays.stream(a).max().getAsInt();
    }

    private int getSum(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new solution1742().countBalls(19,28));
    }
}
