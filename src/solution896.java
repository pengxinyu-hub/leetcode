public class solution896 {
    public boolean isMonotonic(int[] A) {
        if(A.length==1||A.length==0) return true;
        boolean a=true;
        boolean b=true;
        for(int i=1;i<A.length;i++){
            if(A[i]>A[i-1])  a=false;
            if(A[i]<A[i-1])  b=false;
        }
        return a||b;
    }
}
