public class solution201 {
    public int rangeBitwiseAnd(int left, int right) {
        int offset=0;
        while (left!=right){
            left>>=1;
            right>>=1;
            offset++;
        }
        return right<<offset;
    }

    public static void main(String[] args) {
        System.out.println(new solution201().rangeBitwiseAnd(5,7));
    }
}
