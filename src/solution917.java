public class solution917 {
    public String reverseOnlyLetters(String S) {
        int length = S.length();
        char[] ans = S.toCharArray();
        int start = 0;
        int end = length - 1;
        while (start < end) {
            if (isCharacter(ans, start) && isCharacter(ans, end)) {
                swap(ans, start, end);
                start++;
                end--;
            }

            while (!isCharacter(ans, start)&&start<end) {
                start++;
            }

            while (!isCharacter(ans, end)&&start<end) {
                end--;
            }
        }
        return String.valueOf(ans);
    }

    private void swap(char[] chars,int i,int j){
        char temp=chars[i];
        chars[i]=chars[j];
        chars[j]=temp;
    }

    private boolean isCharacter(char[] chars,int i){
        return (chars[i]>='A'&&chars[i]<='Z')||(chars[i]>='a'&&chars[i]<='z');
    }

    public static void main(String[] args) {
        System.out.println(new solution917().reverseOnlyLetters("7_28]"));
    }
}
