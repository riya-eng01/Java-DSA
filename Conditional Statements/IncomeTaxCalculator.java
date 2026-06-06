import java.util.*;
public class IncomeTaxCalculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Calculating Income Tax

        System.out.print("Enter your Income: ");
        int income = sc.nextInt();
        float tax;

        if (income < 50000) {
            tax = 0;
        } else if (income >= 500000 && income <= 1000000 ) {
            tax = income * 0.2f;
        } else {
            tax = income * 0.3f;
        }

        System.out.println("Tax: " + tax);
    } 
}