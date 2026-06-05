public class Assignment1 {
    public static void main(String args[]) {
        // Question-1
        // int x = 2, y = 5;

        // int exp1 = (x * y / x); // 5
        // int exp2 = (x * (y / x)); // 4

        // System.out.println(exp1);
        // System.out.println(exp2);

        // Question -2 
        // int x = 200 , y = 50, z = 100;
        // if ( x > y && y > z ) { // true && false - > false
        //     System.out.println("Hello");
        // }
 
        // if (z > y && z < x) { // true && true - > true
        //     System.out.println("Java");
        // }

        // if ((y + 200 ) < x && (y + 150) < z) { // false  && false -> false 
        //     System.out.println("Hello Java");
        // }

        // Question - 3
        // int x, y, z;
        // x = y = z = 2;

        // x += y; // x += 2 = 2 + 2 = 4
        // y -= z; // y -= 2; 2 - 2 = 0
        // z /= (x + y); // z /= 4 => 2 / 4 => 0

        // System.out.println(x + " " + y + " " + z);

        // Question -4 
        // int x = 10, y = 5;

        // int exp1 = (y * (x / y + x / y)); // 20
        // int exp2 = (y * x / y + y * x / y); // 20

        // System.out.println(exp1);
        // System.out.println(exp2); 

        // Question - 5
        int x = 9, y = 12;
        int a = 2, b = 4, c = 6;
        
        int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y);
        // 4/3 * (9 + 34) + 9 * (2 + 4 * 6) + (3 + 12 * (2 + 2)) / (2 + 4*12)
        // 4/3 * 43 + 9 * 26 + 1
        // 43 + 234 + 1
        // 234 + 44 = 278
        System.out.println(exp);


    }
}