package Arrays_and_hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Valid_anagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        int count = s.length();

        HashMap<Character , Integer> map = new HashMap<>();
        boolean flag = true;

        if (s.length() != t.length()){
            System.out.println("False");
        }

        for (int i=0 ; i<count ; i++){
            map.put(s.charAt(i) , map.getOrDefault(s.charAt(i) , 0) + 1);
        }
        for (int i=0 ; i<count ; i++){
            map.put(t.charAt(i) , map.getOrDefault(t.charAt(i) , 0) - 1);
        }

        for (int value: map.values()){
            if (value != 0){
              flag = false;
            }
        }

        System.out.println(flag);

    }
}
