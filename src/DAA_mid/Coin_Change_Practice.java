package DAA_mid;

import java.util.Scanner;

public class Coin_Change_Practice {
    public static void main(String[] args) {
        int[] denominaitons = {5000 , 1000 , 500 , 100 , 50 , 20 , 10 , 5 , 2, 1};

        Scanner input = new Scanner(System.in);
        int amount = input.nextInt();

        for (int coin : denominaitons) {
            if (amount >= coin){
                int count = amount / coin;

                amount = amount % coin;

                System.out.println(count);
            }
        }
    }
}
