package com.example;

import java.util.Random;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Number Guessing Game!!!");
        System.out.print("Enter start range number: ");
        int startRange = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter end range number: ");
        int endRange = Integer.parseInt(scanner.nextLine());

        int randNumber = random.nextInt(endRange - startRange + 1) + startRange;
        // The nextInt(int bound) method generates a random integer from 0 (inclusive)
        // to the specified bound (exclusive). By subtracting min from max, adding 1,
        // and then adding min, we shift this range to go from min to max.
        int inputNumber;
        int count = 0;
        do {
            System.out.print("Enter your guess: ");
            inputNumber = Integer.parseInt(scanner.nextLine());
            count++;
            if (inputNumber > randNumber) {
                System.out.println("Your guess is too high");
            } else if (inputNumber < randNumber) {
                System.out.println("Your guess is too low");
            } else {
                System.out.println("Congratulations! You guessed the number in " + count + " attempts");
            }
        } while (inputNumber != randNumber);

        System.out.println("Thank you for playing Number Guessing Game!!!");
    }
}
