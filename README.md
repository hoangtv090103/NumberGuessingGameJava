# Number Guessing Game

This is a simple number guessing game implemented in Java.

## How to Play

1. Run the program.
2. Enter the start range number when prompted.
3. Enter the end range number when prompted.
4. The program will generate a random number within the specified range.
5. Enter your guess when prompted.
6. The program will provide feedback if your guess is too high or too low.
7. Keep guessing until you guess the correct number.
8. The program will display the number of attempts it took to guess the correct number.
9. The game ends when you guess the correct number.
10. Thank you for playing!

## Code Explanation

The code uses the `Random` class to generate a random number within the specified range. It also uses the `Scanner` class to read user input.

Here's a breakdown of the code:

1. Import the `Random` and `Scanner` classes.
2. Create a `Random` object to generate a random number.
3. Create a `Scanner` object to read user input.
4. Prompt the user to enter the start range number.
5. Read the start range number from the user.
6. Prompt the user to enter the end range number.
7. Read the end range number from the user.
8. Generate a random number within the specified range.
```java
// Random number within the specified range
int randNumber = random.nextInt(endRange - startRange + 1) + startRange;

```
9. Prompt the user to enter their guess.
10. Read the user's guess.
11. Check if the guess is too high, too low, or correct.
12. Provide feedback to the user based on their guess.
13. Keep track of the number of attempts it takes to guess the correct number.
14. Repeat steps 9-13 until the user guesses the correct number.
15. Display the number of attempts it took to guess the correct number.
16. Close the `Scanner` object.
