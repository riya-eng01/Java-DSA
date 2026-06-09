import java.util.*;
public class Functions {
    // Function to print "hello world 10 times"
    public static void printHelloWorld() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " Hello World");
        }
    }

    // Function to add two numbers
    public static int sumOfTwoNums(int a, int b) {
        int sum = a + b;
        return sum;
    }

    // Main Function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello world !!!");

        // function syntax
        // public static return type function_name() {
        //     statement 1
        //     statement 2
        // }

        // function call
        printHelloWorld();

        // function with parameters (Synatx)
        // public static returnType function_name(type param1, type param2) {
        //     function body
        //     return statement
        // }

        // Sum of two Nums
        System.out.print("Enter number: ");
        int a = sc.nextInt();
        System.out.print("Enter number: ");
        int b = sc.nextInt();
        System.out.println("Sum = " + sumOfTwoNums(a,b)); 
    }
}