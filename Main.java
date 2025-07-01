import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int secretNumber = (int) (Math.random() * 5) + 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("I'm thinking of a number between 1 and 5.");
        for (int i = 1; i <= 3; i++) {
            System.out.print("Guess " + i + ": ");
            int playerGuess = scanner.nextInt();

            if (playerGuess == secretNumber) {
                System.out.println("You guessed it!");
                System.out.println("You win!");
                scanner.close(); 
                return;          
            } else {
                System.out.println("Wrong guess.");
            }
        }
        System.out.println("You lose. The correct number was " + secretNumber);
        scanner.close();
    }
}