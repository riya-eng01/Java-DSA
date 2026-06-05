public class Logical {
    public static void main(String args[]) {
        // Logical Operators
        // AND, OR, NOT -> [&&, ||, !]

        // AND -> Both true
        System.out.println((3 > 2) && (5 > 2));
        System.out.println((10 > 5) && (10 > 20));

        // OR -> Any one true
        System.out.println((2 > 1) || (2 != 2)); // true
        System.out.println((5 >= 10) || (5 <= 2));

        // NOT -> '!'
        System.out.println(!(false)); // false -> true
        System.out.println(!(5 > 2)); // true -> false
    }
}