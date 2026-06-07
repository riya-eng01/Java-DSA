public class ReverseTheNumber {
    public static void main(String args[]) {
        // Reverse the Given Number

        int n = 10899;
        int revNum = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            revNum = (revNum * 10) + lastDigit;
            n = n / 10;
        }

        System.out.println("Reverse Number = " +  revNum);
    }
}