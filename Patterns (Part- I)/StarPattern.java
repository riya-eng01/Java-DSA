public class StarPattern {
    public static void main(String args[]) {
        // Nested for loops 'Star pattern'    
        int n = 4; // total no of rows

        for (int i = 1; i <= n; i++) {
            // stars
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}