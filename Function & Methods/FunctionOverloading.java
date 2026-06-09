public class FunctionOverloading {
    // function Overlaoding using 'No of parameters'
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    // Same function to add three integers
    public static int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    // function Overloading using data types
    public static int multiply(int a, int b) {
        return a * b;
    }

    // function with same name but changed 'data-types'
    public static float multiply(float a, float b) {
        return a * b;
    }

    // main function
    public static void main(String args[]) {
        int a = 10;
        int b = 5;
        int c = 3;

        float x = 2.4f;
        float y = 3.2f;

        // To add two integers
        System.out.println("Sum of two nums = " + sum(a, b));

        // To add three integers
        System.out.println("Sum of three nums = " + sum(a, b, c));

        // multiply two integers
        System.out.println("Product of two integers = " + multiply(a, b));

        // multiply two floats
        System.out.println("Product of two floats = " + multiply(x, y));

    }
}