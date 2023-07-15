import java.util.Random;
import java.util.Scanner;

public class MindGame {
    public static void main(String[] args) {
    Random r = new Random();
    int rdn = r.nextInt(99) + 1;
    //  System.out.println(rdn);
    Scanner scn = new Scanner(System.in);
    int TryCount = 0;
    while (true) {
        System.out.println("Please guess the number (1 to 100):");
        int number = scn.nextInt();
        TryCount++;
        if (number == rdn) {
            System.out.println("Congratulation! You win the prize!🏆");
            {
                if (TryCount == 1) {
                    System.out.println("Wow! You guessed only one time!It's impossible! You are so Genius.");
                } else if (TryCount <= 4 && TryCount > 1) {
                    System.out.println("You guessed " + TryCount + " times.Excellent!");
                } else if (TryCount <= 8 && TryCount > 4) {
                    System.out.println("You guessed " + TryCount + " times.Great!");
                } else if (TryCount > 8 && TryCount < 12) {
                    System.out.println("You guessed " + TryCount + " times.Not bad!Try the best for the next time.");
                } else {
                    System.out.println("You guessed " + TryCount + " times and so many times.You're Idiot! Try the best for next time.");
                }break;
            }
        } else if (number > rdn) {
            System.out.println("Nope! Your guess number is greater than the answer.Guess again");
        } else {
            System.out.println("Nope! Your guess number is lass than the answer.Guess again.");
        }
    }
   }
}

