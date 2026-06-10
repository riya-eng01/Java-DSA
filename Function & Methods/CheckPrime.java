public class CheckPrime {
    // function to check if a number is prime or not
    public static boolean isPrime(int n) {
        boolean isPrime = true;

        if (n == 0) {
            isPrime = true;
        } else {
            for (int i = 2 ; i <= Math.sqrt(n); i++){
                if (n % i == 0) {
                    isPrime = false;
                }
            }
        }
        
        return isPrime;
    }

    public static void main(String args[]) {
        int n = 4; 
        System.out.println(isPrime(n));

    }
}