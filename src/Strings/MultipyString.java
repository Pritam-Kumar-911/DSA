package Strings;

import java.util.ArrayList;

public class MultipyString {
    public static void main(String[] args) {
        String num1 = "123", num2 = "456";
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        for (int i = 0 ; i<num1.length() ; i++){
            int num = num1.charAt(i);
            num = num - 48;
            arrayList.add(num);
        }
        for (int i = 0 ; i<num2.length() ; i++){
            int num = num2.charAt(i);
            num = num - 48;
            arrayList1.add(num);
        }
        int number1 = 0;
        int number2 = 0;
        for (int i = 0 ; i<arrayList.size() ; i++){
            number1 = number1 * 10 + arrayList.get(i);
        }
        for (int i = 0 ; i<arrayList1.size() ; i++){
            number2 = number2 * 10 + arrayList1.get(i);
        }

        int product = number1 * number2;
        String result = String.valueOf(product);
        System.out.println(result);
    }
}
