package Sliding_Window.Variable_Size_Window;

import java.util.HashMap;

public class Longest_Substring_With_k_Unique_Characters {
    public static void main(String[] args) {
        String s = "aabacebebebe";
        int k = 3;
        int i = 0;
        int j = 0;
        HashMap<Character,Integer> count = new HashMap<>();
        int max = 0;

        while (j < s.length()) {
            char ch = s.charAt(j);
            count.put(ch, count.getOrDefault(ch, 0) + 1);

            if (count.size() < k) {
                j++;
            } else if (count.size() == k) {
                max = Math.max(max, j - i + 1);
                j++;
            } else {
                while (count.size() > k) {
                    char leftChar = s.charAt(i);
                    count.put(leftChar, count.get(leftChar) - 1);
                    if (count.get(leftChar) == 0) {
                        count.remove(leftChar);
                    }
                    i++;
                }
                j++;
            }
        }
        System.out.println(max);
    }
}