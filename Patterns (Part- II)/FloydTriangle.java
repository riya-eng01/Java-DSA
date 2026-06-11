public class FloydTriangle {
    // function to print floyd triangle
    public static void floydTriangle(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int n = 5;
        floydTriangle(n);
    }
}