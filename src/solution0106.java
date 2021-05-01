public class solution0106 {
    public String compressString(String S) {
        if(S.length()==0||S.length()==1)  return S;
        String ans="";
        int count=1;
        char begin=S.charAt(0);
        for(int i=1;i<S.length();i++){
            if(S.charAt(i)==S.charAt(i-1)) {
                count++;
            }
            else {
                ans+=begin+""+count;
                begin=S.charAt(i);
                count=1;
            }
        }
        ans+=begin+""+count;
        return S.length()<=ans.length()?S:ans;
    }

    public static void main(String[] args) {
        System.out.println(new solution0106().compressString("a"));
    }
}
