import java.util.*;
public class ProductOfTwoNums {
    // function to calculate product of two nums
    public static int prodTwoNum(int num1, int num2) {
        int result = num1 * num2;
        return result;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // fucntion call
        int product = prodTwoNum(a, b);
        System.out.println(a + " X " + b + " = " + product);

    }
}