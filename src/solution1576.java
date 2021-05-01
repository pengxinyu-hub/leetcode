public class solution1576 {
    public String modifyString(String s) {
        char[] chars=s.toCharArray();
        for(int i=0;i<chars.length;i++){
            char c=chars[i];
            if(c=='?'){
                c='a';
                while ((i>=1&&chars[i-1]==c) || (i<chars.length-1&&chars[i+1]==c))
                    c++;
                chars[i]=c;
            }
        }
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        System.out.println(new solution1576().modifyString("j?qg??b"));
    }
}
