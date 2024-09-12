import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        
        int x = rand.nextInt(100) + 1; // Generates a random number between 1 and 100
        int guess;
        int count = 0; // Count the number of guesses
        int y = 0;

        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("Enter your first guess: ");
        guess = scan.nextInt();
        count++; //increment guess count
        
        while (guess != x) {
            // If guess is lower
            if (guess < x) {
                System.out.println("Too low!");
                y += 1;
            }
            // If guess is higher
            else if (guess > x) {
                System.out.println("Too high!");
                y += 1;
            }
            else if (guess == x){
                //this runs after the correct guess is made
                System.out.println("You got it correct!");
                y += 1;
            }
            // Take a new guess
            guess = scan.nextInt();
            count++;
        }
        
        
        // How well did the user do?
        if (count <= 7) {
            System.out.println("You did great!");
        } else {
            System.out.println("You did terrible.");
        }
    }
}
