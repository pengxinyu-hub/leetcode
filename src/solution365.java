public class solution365 {
    public boolean canMeasureWater(int x, int y, int z) {
        if(z>x+y) return false;
        int max=Math.max(x,y);
        int min=x+y-max;
        if(z==max||z==min) return true;
        int diff=max-min;
        if(z%diff==0)  return true;
        for (int i=min;i>=0;i-=diff){
            if(i==z)  return true;
        }
        return false;
    }
}
