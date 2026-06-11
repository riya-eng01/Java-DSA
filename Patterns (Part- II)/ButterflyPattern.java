public class ButterflyPattern {
    // function to print butterfly pattern
    public static void butterFly(int n) {
        // first half
        for (int i = 1; i <= n; i++) {
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 1; j <= (2 * (n-i)); j++) {
                System.out.print(" ");
            }
            // spaces
            // for (int j = 1; j <= (n-i); j++) {
            //     System.out.print(" ");
            // }

            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Second half
        for (int i = n; i >= 1; i--) {
            // stars 
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 1; j <= (2 * (n-i)); j++) {
                System.out.print(" ");
            }
            // spaces
            // for (int j = 1; j <= (n-i); j++) {
            //     System.out.print(" ");
            // }
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String args[]) {
        int n = 4;
        butterFly(n);
    }
}