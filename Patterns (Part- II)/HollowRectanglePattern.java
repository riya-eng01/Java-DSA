public class HollowRectanglePattern {
    // function to print hollow rectangle pattern
    public static void hollowRectPattern(int rows, int cols) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1 ; j <= cols; j++ ) {
                if ( (i == 1)|| (j == 1) || (i == rows) || (j == cols)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    // main function
    public static void main(String args[]) {
        // function call
        int length = 4;
        int breadth = 5;
        hollowRectPattern(length, breadth);
    }
} 