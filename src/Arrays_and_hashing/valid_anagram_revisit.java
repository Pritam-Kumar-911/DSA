package Arrays_and_hashing;

import java.util.HashMap;

public class valid_anagram_revisit {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        boolean flag;

        HashMap<Character , Integer> map = new HashMap<>();

        if (s.length() != t.length()){
            System.out.println("Return");
        }

        for (int i=0 ; i<s.length() ; i++){
            char c = s.charAt(i);
            map.put(c , map.getOrDefault(c , 0)+1);
        }
        for (int i=0 ; i<t.length() ; i++){
            char c = t.charAt(i);
            if (map.containsKey(c)){
                map.put(c , map.get(c)-1);
            }else {
                map.put(c , map.getOrDefault(c , 0)+1);
            }
            if (map.get(c) == 0){
                map.remove(c);
            }
        }
        if (map.isEmpty()){
            flag = true;
        }else {
            flag = false;
        }

//        map.forEach((key, value) -> System.out.println(key + " : " + value));
        System.out.println(flag);

    }
}
