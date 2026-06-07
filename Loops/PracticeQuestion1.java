import java.util.*;
public class PracticeQuestion1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Keep Entering numbers until user enters multiple of 10
        do {
            System.out.print("Enter number: ");
            int num = sc.nextInt();
            
            if ((num % 10) == 0) {
                System.out.println("You entered a multiple of 10!");
                break;
            }
        } while (true);

    }
}