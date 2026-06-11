import java.util.*;
public class FindFactorial {
    // function to find factorial of a number
    public static int factorial(int num) {
        int fact = 1;

        if ((num == 0) || (num == 1)) {
            return 1;
        } else {
            for (int i = 1; i <= num; i++ ) {
                fact = fact * i;
            }
        }
        return fact;
        
    }

    // main function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int result = factorial(n);

        System.out.println("factorial of " + n + " = " + result);
    } 