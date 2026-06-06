import java.util.*;
public class Calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Calculator using swith statement

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter operator: ");
        char operator = sc.next().charAt(0);

        int operation = 0;

        switch (operator) {
            case '+': operation = (a + b);
                    break;
            case '-': operation = (a - b);
                    break;
            case '*': operation = (a * b);
                    break;
            case '/': operation = (a / b);
                    break;
            case '%': operation = (a % b);
                    break;
            default: System.out.println("Maybe Wrong Operator!");
        }

        System.out.println("Result = " + operation);
    }
}