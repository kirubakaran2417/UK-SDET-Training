package collectionss;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
//        Map<key,value> map = new HashMap<key,value>();
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(22,"lokesh");
        map.put(25,"femi");
        map.put(36,"sowmya");
        map.put(47,"GB");

        System.out.println(map.size());
        System.out.println(map.get(22));

        //for each loop
        for(Integer keys: map.keySet()) {
            System.out.println(keys);
        }

        for (Map.Entry<Integer, String> values: map.entrySet()) {
            System.out.println(values);
        }
        System.out.println(map);
    }
}
