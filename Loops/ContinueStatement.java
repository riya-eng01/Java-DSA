public class ContinueStatement {
    public static void main(String args[]) {
        // Continue -> Skip an Iteration

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }
}