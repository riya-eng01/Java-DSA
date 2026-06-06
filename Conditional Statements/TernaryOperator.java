import java.util.*;
public class TernaryOperator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // ternary operator in Conditional statements

        int age = 13;
        String checkAge = age >= 18 ?  "Adult" : "Not Adult";
        System.out.println("You are: " + checkAge);

        // check largest
        int a = 10;
        int b = 5;
        System.out.println(a > b ? "Largest is a": "Largest is b");

        // Even odd
        System.out.print("Enter Num: ");
        int n = sc.nextInt();
        String result = (n % 2 == 0) ? "Even" : "Odd";
        System.out.println(result);

        // Check if Student will 'pass' OR 'fail'
        int marks = 56;
        String finalResult = (marks >= 33) ? "Pass" : "Fail";
        System.out.println(finalResult);
    }
}