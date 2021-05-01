public class solution1047 {
    public String removeDuplicates(String S) {
        char[] chars=S.toCharArray();
        int index=-1;
        for(int i=0;i<chars.length;i++){
            if(index>=0&&chars[index]==chars[i]){
                index--;
            }
            else {
                index++;
                chars[index]=chars[i];
            }
        }
        return String.copyValueOf(chars,0,index+1);
    }
}
