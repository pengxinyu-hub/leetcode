public class solution633 {
    public boolean judgeSquareSum(int c) {
        int sqrt=(int) Math.sqrt(c);
        int start=0;
        int end=sqrt;
        while (start<=end){
            int res=start*start+end*end;
            if(res==c)
                return true;
            else if(res<c){
                start++;
            }
            else if(res>c){
                end--;
            }
        }
        return false;
    }
}
