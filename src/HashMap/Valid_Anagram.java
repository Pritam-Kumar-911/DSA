package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Valid_Anagram {
    public static void main(String[] args) {
        String s = "a";
        String t = "ab";

        boolean flag = false;
        HashMap<Character, Integer> anag = new HashMap<>();
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            anag.put(c, anag.getOrDefault(c, 0) + 1);
        }
        for (int k = 0; k < t.length(); k++) {
            char c = s.charAt(k);
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }

        for (int j = 0 ; j<t.length() ; j++){
            char c = t.charAt(j);
            if (anag.containsKey(c)){
                anag.put(c , anag.get(c)-1);

                if (anag.get(c) == 0){
                    anag.remove(c);
                }
            }
        }

        System.out.println(anag);
        System.out.println(hashMap);

        if (anag.isEmpty() && hashMap.isEmpty()) {
            flag = true;
        }

        System.out.println(flag);

    }
}
