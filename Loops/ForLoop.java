import java.util.*;
public class ForLoop {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Print Numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Print a Square Pattern
        // Simple Method
        for (int line = 1; line <= 4; line++){
            System.out.println("****");
        }

        // Using Nested for loop
        System.out.print("Enter lines: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Print Reverse of a Number
        int num = 10899;

        while (num > 0) {
            int lastdigit = num % 10;
            System.out.print(lastdigit);
            num = num / 10;
        }

        // int num = 10899;
        // int revNum = 0;

        // while (num > 0) {
        //     int lastdigit = num % 10;
        //     revNum = (revNum*10) + lastdigit;
        //     num = num / 10;
        // }
        // System.out.println(revNum);


    }
}