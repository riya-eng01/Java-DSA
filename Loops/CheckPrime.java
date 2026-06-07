import java.util.*;
public class CheckPrime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Check if a number is prime or Not
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        boolean isPrime = true;

        if (n == 2 ) {
            System.out.println("Prime");
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
            if ((n % i ) == 0) {
                isPrime = false;
                } 
            }
        
            if (isPrime == true) {
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }
        }
        
    }
}