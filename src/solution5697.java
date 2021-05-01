public class solution5697 {
    public boolean checkOnesSegment(String s) {
        String[] strs = s.replaceAll("0", " ").split("\\s+");
        return strs.length <= 1;
    }

    public static void main(String[] args) {
        System.out.println(new solution5697().checkOnesSegment("1"));
    }
}
