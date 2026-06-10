public class BinToDec {
    // function to convert Binary to Decimal
    public static int BinToDec(int n ) {
        int decimal = 0;
        int pow = 0; 

        while (n > 0) {
            int lastDigit = n % 10;
            decimal = decimal + (lastDigit * (int)Math.pow(2, pow));
            n = n / 10;
            pow++;
        }
        return decimal;
    }

    public static void main(String args[]) {
        int binNum = 101;
        System.out.println("decimal of " + binNum + " = " + BinToDec(binNum));
    }
}