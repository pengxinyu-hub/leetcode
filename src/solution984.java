public class solution984 {
    public String strWithout3a3b(int a, int b) {
        String ans="";
        boolean flag=false;  //flag=false代表前面为A，flag=1代表前面为B
        int max=Math.max(a,b);
        if(a==max){
            flag=true;
        }
        else {
            flag=false;
        }
        while (a>=2||b>=2){
            if(flag) {
                if(a<b){
                    ans+="a";
                    a-=1;
                }
                else {
                    ans += "aa";
                    a -= 2;
                }
            }
            else  {
                if(b<a){
                    ans+="b";
                    b-=1;
                }
                else {
                    ans += "bb";
                    b -= 2;
                }
            }
            flag=!flag;
        }
        if(flag){
            while (a-->0)
                ans+='a';
            while (b-->0)
                ans+='b';
        }
        if(!flag){
            while (b-->0)
                ans+='b';
            while (a-->0)
                ans+='a';
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new solution984().strWithout3a3b(6,3));
    }
}
