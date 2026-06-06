import java.util.*;
public class PrintEvenOdd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Print odd or even
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if ((num % 2) == 0) {
            System.out.println("Number = " + num);
            System.out.println("It is even!");
        } else {
            System.out.println("Number = " + num);
            System.out.println("It is odd!");
        }
    } 
}