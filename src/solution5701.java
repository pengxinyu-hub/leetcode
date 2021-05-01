public class solution5701 {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2))  return true;
        int[] a=new int[2];
        int point=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                if(point==2)  return false;
                a[point++]=i;
            }
        }
        if(point==1)  return false;
        if(s1.charAt(a[0])==s2.charAt(a[1])&&s2.charAt(a[0])==s1.charAt(a[1]))
            return true;
        return false;
    }
}
