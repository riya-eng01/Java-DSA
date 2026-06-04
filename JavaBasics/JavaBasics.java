import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Hello world!\n");
        System.out.print("Hello World\n");

        // print a pattern
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");

        String name = "Tony Stark";
        System.out.println(name);

        int a = 10;
        int b = 5;
        System.out.println(a);
        System.out.println(b);
        a = 50;
        System.out.println(a);

        // Data types
        byte c = 8;
        System.out.println(c);
        char ch = 'a';
        System.out.println(ch);
        boolean var = true;
        System.out.println(var);
        float price = 10.5f;
        System.out.println(price);
        int num = 45;
        System.out.println(num);

        // Code to calculate Sum
        int num1 = 10;
        int num2 = 20;
        // int sum = num1 + num2;
        System.out.println("Sum = " + (num1+num2));

        // Comments in Java - does not execute!

        /*
        This 
        is Multi
        line Comment!
        */

        // Input in java
        System.out.print("Enter Name: ");
        String fullName = sc.nextLine();
        System.out.println(fullName);

        System.out.print("Enter Number: ");
        int number = sc.nextInt();
        System.out.println(number);

        System.out.print("Enter Price: ");
        float itemPrice = sc.nextFloat();
        System.out.println(itemPrice);

        // Sum of two numbers input from users
        System.out.print("Enter first number: ");
        int firstNum = sc.nextInt();
        System.out.print("Enter second number: ");
        int secondNum = sc.nextInt();
        int sum = firstNum + secondNum;
        System.out.println("Total Sum = " + sum);

        // Product of 2 Numbers
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        System.out.print("Enter y: ");
        int y = sc.nextInt();
        int prod = x * y;
        System.out.println("Product = " + prod);

        // Area of a Circle 
        float radius = 3.0f;
        float area = 3.14f * radius * radius;
        System.out.println("Area = " + area);

        // Type casting- Narrowing/explicit Conversion
        float m = 25.56f;
        int n = (int) m;
        System.out.println(n);

        char ch2 = 'a';
        int l = ch2;
        System.out.println(l);

        // type Promotion
        char ch3 = 'a';
        char ch4 = 'b';
        System.out.println(ch3 + ch4); // 97+ 98 
        System.out.println(ch4 - ch3); // 98- 97

    }
}