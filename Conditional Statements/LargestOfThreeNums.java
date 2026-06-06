public class LargestOfThreeNums {
    public static void main(String args[]) {
        // Printing Largest of three numbers

        int A = 1, B = 3, C = 6;

        if ((A >= B)  && (A >= C)) {
            System.out.println("Largest is A: " + A);
        } else if (B >= C) {
            System.out.println("Largest is B: " + B);
        } else {
            System.out.println("Largest is C: " + C);
        }
    }
}