public class CallByValue {
    // function to swap two numbers
    public static void swapTwoNums(int a, int b) {
        //swap
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }

    // functoin to change value
    public static void changeX(int x) {
        x = 20;
        System.out.println("x changed to = " + x);
    }

    public static void main(String args[]) {

        int a = 10;
        int b = 5;

        // function call
        swapTwoNums(a, b); 

        // Original values remains unchanged - "A copy of these variable were passed"
        // The values in 'main' functions are not changed!
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Original value of x
        int x = 12;

        // function call
        changeX(x);
        System.out.println("original x = " + x);
    }
}