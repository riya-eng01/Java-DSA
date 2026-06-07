import java.util.*;
public class ContinueStatement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Continue -> Skip an Iteration

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();

        // Display all Numbers enetred by user except multiple of 10
        do {
            System.out.print("Enter number: ");
            int num = sc.nextInt();

            if ((num % 10) == 0) {
                continue;
            }
            System.out.println("You number was : " + num);
        } while (true);
    }
}