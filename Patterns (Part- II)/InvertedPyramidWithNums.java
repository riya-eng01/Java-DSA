public class InvertedPyramidWithNums {
    // function to print pyramid with nums
    // public static void halfPyramidNums(int n) {
    //     for (int i = n; i >= 1; i--) {
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print(j);
    //         }
    //         System.out.println();
    //     }
    // }

    public static void halfPyramidNums(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n-i+1); j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // main function
    public static void main(String args[]) {
        // call function 
        int n = 5; 
        halfPyramidNums(n);
    }
}