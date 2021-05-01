public class solution5700_unsolved {
    public int minChanges(int[] nums, int k) {
        int res=0;
        int maxlength=0;
        String[] strings=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            strings[i]=one(nums[i]);
            if(strings[i].length()>maxlength)
                maxlength=strings.length;
        }

        for(int i=0;i<strings.length;i++){
            if(strings[i].length()<maxlength){
                int diff=maxlength-strings[i].length();
                String s="0";
                while (--diff>0){
                    s+='0';
                }
                strings[i]=s+strings[i];
            }
        }
        int count[][]=new int[strings.length][maxlength];
        for(int i=0;i<strings.length;i++){
            for(int j=0;j<maxlength;j++){

            }
        }


        return res;
    }

    private String one(int iNum){
        String res="";
        while(iNum!=0){
            if ((iNum%2)==1){
                res+="1";
            }
            else
                res+="0";
            iNum = iNum >> 1;
        }
        StringBuilder sb=new StringBuilder(res);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(new solution5700_unsolved().one(4));
    }
}
