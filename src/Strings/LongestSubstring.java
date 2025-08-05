package Strings;

import java.util.ArrayList;

public class LongestSubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";
        ArrayList<String> substr = new ArrayList<>();
        StringBuilder letters = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (letters.toString().contains(String.valueOf(c))) {
                substr.add(letters.toString());

                // Remove characters from start until duplicate is removed
                while (letters.toString().contains(String.valueOf(c))) {
                    letters.deleteCharAt(0);
                }
            }

            letters.append(c);
        }

        // Add last part
//        if (letters.length() > 0) {
//            substr.add(letters.toString());
//        }

        System.out.println(substr);
    }
}
