import java.util.*;

public class Main{
public static void main(String[] args) {
    Map<Integer,String> map =  new HashMap<>();
    map.put(1, "kes");
    map.put(2, "les");
    map.put(3, "bob");
    map.put(4, "jake");
    map.remove(4);
    System.out.println(map);
    for(var item:map.entrySet()){
        System.out.println(item.getKey());
    }
}
}