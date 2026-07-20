package Arrays_and_hashing;

import java.util.HashSet;

public class Valid_anagram {
    public static void main(String[] args) {
        String s = "rat";
        String t = "car";
        HashSet<Character> set = new HashSet<>();
        boolean flag = true;

        for (int i=0 ; i<s.length() ; i++){
            char c = s.charAt(i);
            set.add(c);
        }
        for (int i=0; i<t.length() ; i++){
            if (!set.contains(t.charAt(i))){
                flag = false;
            }
        }
        System.out.println(flag);
    }
}
