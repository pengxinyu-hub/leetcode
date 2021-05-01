public class solution605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=0;
        if(flowerbed[0]==0&&(flowerbed.length==1||flowerbed[1]==0)){
            flowerbed[0]=1;
            count++;
        }
        for(int i=1;i<flowerbed.length-1;i++){
            if(flowerbed[i]==0&&flowerbed[i-1]==0&&flowerbed[i+1]==0){
                flowerbed[i]=1;
                count++;
            }
        }
        if(flowerbed.length>2&&flowerbed[flowerbed.length-2]==0&&flowerbed[flowerbed.length-1]==0) {
            flowerbed[flowerbed.length - 1] = 0;
            count++;
        }
        System.out.println(count);
        return count>=n;
    }

    public static void main(String[] args) {
        int[] f={0,1,0,0};
        System.out.println(new solution605().canPlaceFlowers(f,1));
    }
}
