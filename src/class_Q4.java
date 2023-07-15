import java.util.Arrays;
import java.util.Scanner;

public class class_Q4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int UserInput = scn.nextInt();
        int Numbers[] = new int [UserInput];
        for (int i = 0; i < UserInput; i++) {
            System.out.println("Enter a number: ");
            int UserInput1 = scn.nextInt();
            Numbers[i]= UserInput1;

        }
       for (int j = 0; j < UserInput; j++) {

            System.out.print(Numbers[j] * 2 + "\t");
       }
     //   System.out.println(Arrays.toString(Numbers));
    }
}
