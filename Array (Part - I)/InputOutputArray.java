import java.util.*;
public class InputOutputArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // taking input in an array
        int marks[] = new int[50];

        System.out.print("Enter phy marks: ");
        marks[0] = sc.nextInt();
        System.out.print("Enter chem marks: ");
        marks[1] = sc.nextInt();
        System.out.print("Enter math marks: ");
        marks[2] = sc.nextInt();

        System.out.print("Maths marks = " + marks[2]);
    }
}