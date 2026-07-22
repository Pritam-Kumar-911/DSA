package Arrays_and_hashing;

import java.util.*;

public class Group_Anagrams {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        HashMap<String , List<String>> set = new HashMap<>();
        ArrayList<String> AL = new ArrayList<>();
        for (String s : strs){
            String word = s;
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            set.computeIfAbsent(sorted , k -> new ArrayList<>()).add(word);
        }

        ArrayList<List<String>> ArrList = new ArrayList<>(set.values());

        System.out.println(ArrList);
    }
}
