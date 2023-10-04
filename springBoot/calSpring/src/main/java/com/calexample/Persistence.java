package com.calexample;
import java.util.Scanner;

public class Persistence {
    public static int persistence(int num) {
        // Base case: if the number is already a single-digit number, return 0
        if (num < 10) {
            return 0;
        }

        // Convert the number to a string to get individual digits
        String numStr = String.valueOf(num);

        // Initialize the product of digits and the number of multiplications
        int product = 1;
        int count = 0;

        // Calculate the product of digits
        for (int i = 0; i < numStr.length(); i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            product *= digit;
        }

        // If the product is not a single-digit number, call the function recursively
        if (product >= 10) {
            count = persistence(product);
        }

        // Return the total count of multiplications
        return count + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int num = scanner.nextInt();

        int result = persistence(num);
        System.out.println("Multiplicative persistence: " + result);
    }
}
