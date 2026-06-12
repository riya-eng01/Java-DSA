public class CreateArray {
    public static void main(String args[]) {
        // Creating an array
        int marks[] = new int [5];
        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;
        marks[3] = 40;
        marks[4] = 50;

        // Printing an array
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();

        // Create array
        int numbers[] = {1, 2, 3, 4, 5};
        String fruits[] = {"apple", "Banana", "Mango", "Orange"};

        // Printing an array
        for (int item : fruits) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}