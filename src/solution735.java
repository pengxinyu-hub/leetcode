public class solution735 {
    public int[] asteroidCollision(int[] asteroids) {
        int length=asteroids.length;
        for(int i=0;i<length-1;i++){
            if(asteroids[i]>0&&asteroids[i+1]<0){
                if(asteroids[i]>Math.abs(asteroids[i+1])){
                    for(int j=i+1;j+1<=length-1;j++){
                        asteroids[j]=asteroids[j+1];
                    }
                    length--;
                    i--;
                }

                else if(asteroids[i]<Math.abs(asteroids[i+1])){
                    asteroids[i]=asteroids[i+1];
                    for(int j=i+1;j+1<=length-1;j++){
                        asteroids[j]=asteroids[j+1];
                    }
                    length--;
                    if(i-1>=0&&asteroids[i-1]>0) {
                        i--;
                    }
                    i--;
                }
                else if(asteroids[i]==Math.abs(asteroids[i+1])){
                    for(int j=i+2;j<=length-1;j++){
                        asteroids[j-2]=asteroids[j];
                    }
                    length=length-2;
                    if(i-1>=0)
                        i--;
                    i--;
                }
            }
        }
        int[] ans=new int[length];
        for(int i=0;i<length;i++)
            ans[i]=asteroids[i];
        return ans;
    }

    public static void main(String[] args) {
        int[] a=new solution735().asteroidCollision(new int[]{-2,1,-1,2});
        for(int b:a)
            System.out.println(b);
    }
}
