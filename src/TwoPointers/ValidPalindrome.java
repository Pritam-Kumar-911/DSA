package TwoPointers;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "race a car";
        boolean flag = true;

        String ans = s.replaceAll("[^a-zA-Z0-9]", "");

        System.out.println(ans);
        String resultString = ans.toLowerCase();
        System.out.println(resultString);

        int left = 0;
        int right = resultString.length()-1;

        while (left<right) {
            if (resultString.charAt(left) == resultString.charAt(right)) {
                left++;
                right--;
            }else{
                flag = false;
                
            }
        }
        System.out.println(flag);
    }
}
