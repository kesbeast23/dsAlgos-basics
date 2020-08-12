import java.util.HashMap;
import java.util.Map;

public class CharFinder {
    public char findFirstNonRepeatingChar(String str){
        Map<Character,Integer> map = new HashMap<>();
        for (var ch:str.toCharArray()) {
            if(map.containsKey(ch)){
                var count = map.get(ch);
                map.put(ch,count+1);
            }else{
                map.put(ch,1);
            }
        }
    }
}
