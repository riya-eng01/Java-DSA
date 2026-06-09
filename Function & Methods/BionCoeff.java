public class BionCoeff {
    // function to calculate factorial
    public static int fact(int n) {
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    // function to calculate binomial coefficient
    public static int BinCoff(int n, int r) {
        int binCoff = fact(n) / (fact(r) * (fact(n-r)));
        return binCoff;
    }

    public static void main(String args[]) {
        //  Binomial coefficient 
        int n = 5;
        int r = 2;
        System.out.println("Binomial Coeff = " + BinCoff(n, r));
    }
}