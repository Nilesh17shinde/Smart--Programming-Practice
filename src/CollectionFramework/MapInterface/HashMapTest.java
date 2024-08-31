package CollectionFramework.MapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Nilesh", 95);
        hashMap.put("Deva", 98);
        hashMap.put("Deva", 96); // This will overwrite the previous value for "Deve"
        hashMap.put("Shraddha", 89);

        System.out.println(hashMap.get("Deva")); // Output will be 96
        System.out.println("-------------------------------------------------");

        Iterator<Map.Entry<String, Integer>> itr = hashMap.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<String, Integer> current = itr.next();

            if (current.getKey().equals("matching")) { // Assuming you want to remove the key "matching"
                itr.remove();
            }
        }
        System.out.println(hashMap);
    }
}
