import java.util.*;

public class Assignment1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Question-1
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter c: ");
        int c = sc.nextInt();

        float average = (a + b + c ) / 3;
        System.out.println("Average = " + average);

        // Question-2 
        System.out.print("Side of Square: ");
        float side = sc.nextFloat();
        float areaOfSquare = side * side;
        System.out.println("Area of square = " + areaOfSquare);

        // Question-3
        System.out.print("Enter pencil price: ");
        float pencilPrice = sc.nextFloat();

        System.out.print("Enter pen price: ");
        float penPrice = sc.nextFloat();

        System.out.print("Enter eraser price: ");
        float eraserPrice = sc.nextFloat(); 

        float totalCost = pencilPrice + penPrice + eraserPrice;
        System.out.println("Bill: " + totalCost);

        // Question-4
        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;
        double result = (f * b) + (i % c) - (d * s);
        // type of result = "double"

        // Question-5
        int $ = 24;
        System.out.println($); // valid identifier

        // No, the statement will not give any error.Names of variables are called identifiers in Java. Identifier rule says,identifiers can start with any alphabet or underscore (“_”) or dollar (“$”).According to the rule the given variable name is a valid identifier.

    }
}