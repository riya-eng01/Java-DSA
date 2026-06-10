public class CheckPrime {
    // function to check if a number is prime or not
    public static boolean isPrime(int n) {

        if (n == 2) {
            return true;
        }
        
        for (int i = 2 ; i <= Math.sqrt(n); i++){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Main function
    public static void main(String args[]) {
        int n = 4; 
        System.out.println(isPrime(3));

    }
}