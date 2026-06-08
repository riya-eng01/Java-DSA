import java.util.*;
public class Assignment {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Ques-1
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            i += 2;
        }

        // Ques-2
        int n = 329674;
        int evenSum = 0;
        int oddSum = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            if ((lastDigit % 2) == 0) {
                evenSum = evenSum + lastDigit;
            } else {
                oddSum = oddSum + lastDigit;
            }
            n = n / 10;
        }

        System.out.println("Sum of even Integers = " + evenSum);
        System.out.println("Sum of odd Integers = " + oddSum);

        // Ques-3
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + num + " = " + fact);

        // Ques-4
        System.out.print("Enter number: ");
        int x = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(x + " X " + i + " = " + (x*i));
        }

        // Ques-5
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        // System.out.println("i after the loop" + i );
        // 'i' was declared inside the for loop so it cannot be accssed outside the for loop.
    }
}