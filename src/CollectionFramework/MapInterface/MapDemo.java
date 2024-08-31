package CollectionFramework.MapInterface;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map map=new HashMap();
        map.put(101,"Nilesh");
        map.put(102,"Shraddha");
        map.put(103,"Shubhal");
        map.put(104,"Deva");
        map.put(106,"vikas");
        System.out.println(map);
        map.put(105,101);
        System.out.println(map.entrySet());
        System.out.println(map.containsKey(103));
        System.out.println(map.containsValue("Deva"));
        System.out.println(map.get(102));
        System.out.println(map.isEmpty());
        System.out.println(map.replace(104,"Deva","Gaurav"));
        System.out.println(map);
    }
}
