public class Ifelseif {
    public static void main(String args[]) {
        // if else if statements
        int age = 22;

        if (age >= 18) {
            System.out.println("Adult");
        } else if (age >= 13 && age < 18) {
            System.out.println("Teenager");
        } else {
            System.out.println("Child");
        }
    }
}