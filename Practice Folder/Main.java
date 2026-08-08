import java.util.*;
public class Main{
    public static void printSquare(int num) {
        for(int i = 1; i <= num; i++) {
            // inner loop
            for(int j = 1; j <= num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // Print square pattern
        printSquare(4); 
        
        // Ques -1
        // System.out.print("Enter a number: ");
        // int num1 = sc.nextInt();
        // System.out.print("Enter second number: ");
        // int num2 = sc.nextInt();
        // System.out.print("Enter a third number: ");
        // int num3 = sc.nextInt();

        // int avg = (num1 + num2 + num3 )/ 3;
        // System.out.println("Average = "+ avg);

        // Ques-2
        // System.out.print("Enter side of a square: ");
        // float side = sc.nextFloat();
        // float area = side * side;
        // System.out.println("Area of square = " + area);

        // Ques-3
    //     System.out.print("Enter pencil price: ");
    //     float pencilPrice = sc.nextFloat();
    //     System.out.print("Enter pen price: ");
    //     float penPrice = sc.nextFloat();
    //     System.out.print("Enter earaser price: ");
    //     float earaserPrice = sc.nextFloat();

    //     float total_bill = pencilPrice + penPrice + earaserPrice;
    //     System.out.println("Total Bill: " + total_bill);
    // 

    int $ = 24;
    System.out.println($);
    
    }
}