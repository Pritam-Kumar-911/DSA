package DAA_mid;


import java.util.Scanner;

public class Coin_Changing_Problem {
    public static void main(String[] args) {
        // Step 1: Define Pakistani Currency denominations in descending order
        int[] denominations = {5000, 1000, 500, 100, 50, 20, 10, 5, 2, 1};

        // Step 2: Get user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount in PKR: ");
        int amount = input.nextInt();

        System.out.println("\nChange Breakdown for " + amount + " PKR:");
        System.out.println("-----------------------------");

        // Step 3: The Greedy Algorithm
        for (int coin : denominations) {
            if (amount >= coin) {
                // Calculate how many of this denomination fit
                int count = amount / coin;

                // Calculate the remaining balance
                amount = amount % coin;

                System.out.println(coin + " PKR units: " + count);
            }
        }
    }
}
