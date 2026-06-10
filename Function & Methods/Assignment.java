public class Assignment {
    // function to compute the avg of three nums
    public static int calAvg(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    // method to check even integers
    public static boolean isEven(int n) {
        if ((n % 2) == 0) {
            return true;
        }
        return false;
    }

    // function to check palindrome number 
    public static boolean isPalindrome(int n) {
        int curNum = n;
        int revNum = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            revNum = (revNum * 10)  + lastDigit;
            n = n / 10; 
        }

        if (curNum == revNum) {
            return true;
        }
        return false;
    }

    // method to compute sum of digits in a number
    public static int sumOfDig(int n) {
        int sum = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            sum = sum + lastDigit;
            n = n / 10;
        }
        return sum;
    }

    // main function
    public static void main(String args[]) {
        // Ques - 1 (average of three numbers)
        int a = 10;
        int b = 5;
        int c = 3;
        System.out.println("average = " + calAvg(a, b, c));

        // Ques-2
        int x = 4; 
        if (isEven(x)) {
            System.out.println("Even Integer!");
        } else {
            System.out.println("Odd Integer!");
        }

        // Ques-3 Check palindrome number
        int y = 123;
        if (isPalindrome(y)) {
            System.out.println("Yes, Palindrome!");
        } else{
            System.out.println("Not, Palindrome!");
        }

        // Ques - 4 (Math function)
        System.out.println("Minimum = " + Math.min(10, 5));
        System.out.println("Maximum = " + Math.max(10, 5));
        System.out.println("Sqrt = " + Math.sqrt(6));
        System.out.println("Absolute value = " + Math.abs(-10)); 

        // Ques - 5
        int num = 12345;
        System.out.println("Sum = " + sumOfDig(num));

    }
}