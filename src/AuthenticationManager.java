import java.util.HashMap;
import java.util.Map;

public class AuthenticationManager {
    Map<String,Integer> map;
    private int t;
    public AuthenticationManager(int timeToLive) {
        map=new HashMap<>();
        t=timeToLive;
    }

    public void generate(String tokenId, int currentTime) {
        map.put(tokenId,currentTime+t);
    }

    public void renew(String tokenId, int currentTime) {
        if(map.containsKey(tokenId)&&currentTime<map.get(tokenId)){
            map.put(tokenId,currentTime+t);
        }
    }

    public int countUnexpiredTokens(int currentTime) {
        int count=0;
        for(String key: map.keySet()){
            if(map.get(key)>currentTime)
                count++;
        }
        System.out.println(map);
        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        AuthenticationManager manager=new AuthenticationManager(5);
        manager.renew("aaa",1);
        manager.generate("aaa",2);
        manager.countUnexpiredTokens(6);
        manager.generate("bbb",7);
        manager.renew("aaa",8);
        manager.renew("bbb",10);
        manager.countUnexpiredTokens(15);

    }
}
