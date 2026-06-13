import java.util.*;
public class InputOutputArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // taking input in an array
        int marks[] = new int[50];

        // System.out.print("Enter phy marks: ");
        // marks[0] = sc.nextInt();
        // System.out.print("Enter chem marks: ");
        // marks[1] = sc.nextInt();
        // System.out.print("Enter math marks: ");
        // marks[2] = sc.nextInt();

        marks[0] = 75; // phy
        marks[1] = 80; // chem
        marks[2] = 90; // maths
        
        System.out.println("Math marks = " + marks[2]);

        // Updating array marks
        marks[2] = 85;
        System.out.println("Math marks = " + marks[2]);

        // adding in array
        marks[2] = marks[2] + 1;
        System.out.println(marks[2]);

        // Calculating average
        int avg = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("Average = " + avg);

        // length of an array
        System.out.println("length = " + (marks.length))

    }
}