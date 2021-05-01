public class solution796 {
    public boolean rotateString(String A, String B) {
        if(A.length()!=B.length()) return false;
        String AA=A+A;
        return AA.contains(B);
    }
}
