public class InvertedStarPattern {
    public static void main(String args[]) {
        // Inverted star pattern
        int n = 4; // total no of Lines/Rows

        // for (int i = 1; i <= n; i++ ) {
        //     for (int j = 1; j <= (n-i+1); j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Second approach
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}