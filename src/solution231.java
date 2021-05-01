public class solution231 {
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        int m=n^(n-1);
        if(m==2*n-1){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new solution231().isPowerOfTwo(256));
    }
}
