import java.util.*;
public class Assignment {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        // Ques- 1
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("Positive Number!");
        } else if ( num == 0) {
            System.out.println("Neither Positive nor Negative!");
        } else {
            System.out.println("Negative Number!");
        }

        // Ques-2
        double temp = 103.5;

        if (temp > 100) {
            System.out.println("You have fever!");
        } else {
            System.out.println("You do not have fever!");
        }

        // Ques-3 
        System.out.print("Enter day number: ");
        int day = sc.nextInt();

        switch (day) {
            case 1: System.out.println("Monday");
                    break;
            case 2: System.out.println("Tuesday");
                    break;
            case 3: System.out.println("Wednesday");
                    break;
            case 4: System.out.println("Thursday");
                    break;
            case 5: System.out.println("Friday");
                    break;
            case 6: System.out.println("Saturday");
                    break;
            case 7: System.out.println("Sunday");
                    break;
            default: System.out.println("Maybe Wrong day number!");
        }

        // Ques-4
        int a = 63, b = 36;
        boolean x = (a < b) ? true : false; // x = false
        int  y = (a > b) ? a : b; // y = 63
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        
    }
}