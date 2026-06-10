public class DecToBin {
    // function to convert decimal to binary
    public static int decToBin(int n) {
        int pow = 0;
        int binary = 0;

        while (n > 0) {
            int rem = n % 2;
            binary = binary + (rem * (int)Math.pow(10, pow));
            n = n / 2;
            pow++;
        }
        return binary;
    }

    // Main function
    public static void main(String args[]) {
        int decNum = 10;
        System.out.println("Binay of " + decNum + " = " + decToBin(decNum));
    }
}