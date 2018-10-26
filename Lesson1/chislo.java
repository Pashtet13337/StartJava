import java.util.Random;
import java.util.Scanner;
 
public class chislo {
     
    public static void main (String[] args) {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(5000);
        int numberOfTries = 0;
        Scanner input = new Scanner(System.in);
        int guess;
        boolean win = false;
        System.out.println( "- Я загадал число от 1 до 5000" );
         
        while (win == false) {
         
            System.out.println( "Type number:" );
            guess = input.nextInt();
             
            numberOfTries++;
             
            if (guess == numberToGuess) {
                win = true;
            } 
            else if (guess < numberToGuess) {
                System.out.println("- твое число  маленькое\n");
            }
            else if (guess > numberToGuess) {
                System.out.println("- твое число  большое\n");
            }
        }
        System.out.println("\nПоздравляю! Ты выиграл!");
        System.out.println("Число было: " + numberToGuess);
        System.out.println("Количество попыток: " + numberOfTries);
    }
}