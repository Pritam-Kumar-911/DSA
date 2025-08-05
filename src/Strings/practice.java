package Strings;

import java.util.Scanner;

public class practice {
    static String s = "   fly me   to   the moon ";
    public static void main(String[] args) {
        String trimmed = s.trim();
        System.out.println(trimmed);
        String lastword = null;
        for (int i=trimmed.length()-1 ; i >= 0 ; i--){
            if (trimmed.charAt(i) == ' '){
                lastword = trimmed.substring(i+1 ,trimmed.length());
                break;
            }
        }
        if (lastword == null){
            lastword = trimmed;
        }
        System.out.println(lastword.length());
    }
}