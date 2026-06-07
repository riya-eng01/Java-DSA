import java.util.*;
public class WhileLoop {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Printing "Hello world" 100 times
        int i = 1;
        while(i <= 100) {
            System.out.println(i + " Hello world");
            i++; 
        }

        // Printing Numbers from 1 to 10
        // System.out.println("Numbers from 1 to 10: ");
        // int counter = 1;
        // while (counter <= 10) {
        //     System.out.println(counter);
        //     counter++;
        // }

        // Printing Numbers from 1 to N
        int num = 1;

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        while (num <= n) {
            System.out.print(num + " ");
            num++;
        }
        System.out.println();

        // Sum of first 'n' Natural numbers
        int j = 1; // iterator
        int sum = 0;

        System.out.print("Enter range: ");
        int range = sc.nextInt();

        while (j <= range) {
            sum = sum + j;
            j++;
        }
        System.out.println("Sum = " + sum);
    }
}