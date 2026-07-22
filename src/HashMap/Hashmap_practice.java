package HashMap;

import java.sql.Struct;
import java.util.HashMap;
import java.util.Map;

public class Hashmap_practice {
    public static void main(String[] args) {
        //country(key) ,  population (value)
        HashMap<String , Integer> map = new HashMap<>();


        //While insertion via map.put
        //if key exist --> updates
        //if doesn't exits --> make one

        //insertion
        map.put("pakistan" , 120);
        map.put("USA" , 30);
        map.put("China" , 100);

        System.out.println(map);

        map.put("China" , 120);

        System.out.println(map);

        //search

        if (map.containsKey("pakistan")){
            System.out.println("Present"); // return true
        }else {
            System.out.println("Key is not present"); //returns false
        }

        // get function (gets the value of the Key)
        System.out.println(map.get("China")); // key exits
        System.out.println(map.get("India")); // key doesnt present (return null)


        System.out.println("Values of map");
        for (String value: map.keySet()){ // or map.keyvalue()
            System.out.println(value);
        }

        for (Map.Entry<String , Integer> e : map.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue() );
        }

        //remove a key
        map.remove("China");
        System.out.println(map);
    }
}
