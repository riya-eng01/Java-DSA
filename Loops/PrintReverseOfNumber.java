public class PrintReverseOfNumber {
    public static void main(String args[]) {
        // Print reverse of a Number

        int n = 10899;

        while (n > 0){
            int lastdigit = n % 10;
            System.out.print(lastdigit);
            n = n / 10;
        }
    }
}