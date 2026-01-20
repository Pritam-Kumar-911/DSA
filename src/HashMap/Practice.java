package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Practice {
    public static void main(String[] args) {
        HashMap<String , Integer> maps = new HashMap<>();

        maps.put("Pakistan" , 22);
        maps.put("China" , 45);
        maps.put("USA" , 60);

        System.out.println(maps);

        //search
        if (maps.containsKey("China")){
            System.out.println("Key is present in the Map");
        }else
            System.out.println("Key is not present!");

        //Getting the value of key
        System.out.println(maps.get("China")); //key exists
        System.out.println(maps.get("Indonesia"));//key doesnt exist --> returns null

        //Iterating Map
        //Through Entry Set
        for (Map.Entry<String , Integer> e : maps.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        //Through Key Set
        Set<String> keys = maps.keySet();
        for (String key : keys){
            System.out.println(key + " " + maps.get(key));
        }
        //Removing the Map
        maps.remove("China");
        System.out.println(maps);



    }
}
