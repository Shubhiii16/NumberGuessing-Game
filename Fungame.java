import java.util.Scanner;

public class Fungame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minNumber = 1;  // Minimum value for the random number
        int maxNumber = 100;  // Maximum value for the random number

// Generate a random number between minNumber and maxNumber (inclusive)
        int randomNumber = (int) (Math.random() * (maxNumber - minNumber + 1)) + minNumber;

        System.out.println("Welcome to the Fun Game!");
        System.out.println("Guess a number between " + minNumber + " and " + maxNumber + ".");

        int attempts = 0;
        boolean hasWon = false;

        while (!hasWon) {
            int guess = scanner.nextInt();
            attempts++;

            if (guess == randomNumber) {
                hasWon = true;
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
            } else if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        scanner.close();
    }
}

