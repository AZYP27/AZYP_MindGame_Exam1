import java.util.Scanner;

public class class_Q2 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number: ");
            int UserInput = Scan.nextInt();
            if (UserInput == 0){
                System.out.println("You enter Zero.");
            } else if (UserInput % 2 == 0) {
                System.out.println("Your number is Positive.");
            } else
            {System.out.println("Your number is Negative.");
            }
        }
    }
}
