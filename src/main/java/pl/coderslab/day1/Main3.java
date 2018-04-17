package pl.coderslab.day1;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main3 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("cieplo", "zimno");
        map.put("jasno", "ciemno");
        Set<String> keys = map.keySet();
        for (String key: keys ) {
            System.out.println(key);

            System.out.println(map.get(key));

        }
    }
}
