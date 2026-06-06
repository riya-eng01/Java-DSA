import java.util.*;
public class ArrayBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        // Array Creation 
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        System.out.println(arr[3]);

        // length of an array
        System.out.println("length of array = " + arr.length);

        // generic way of defining an array
        int[] num = {4, 7, 9, 12};
        System.out.println(num[2]);

        // 2D Arrays
        int[][] nums = {{1,2}, {3,4}, {5,6}, {7,8}};
        System.out.println(nums[1][1]);

        // Accessing array inside 'nums' 2D array
        int[] zeroIndex = nums[0]; // Not an index, but array itdelf at index 0
        System.out.println(zeroIndex[1]);

        // Input size of an array
        System.out.print("Enter Length of array: ");
        int size = sc.nextInt(); // 5
        int[] arr1 = new int[size];

        // Input values in array
        for (int i = 0; i <= (size-1); i++) {
                System.out.print("Enter value: ");
                arr1[i] = sc.nextInt();
        }

        // Printing the array
        int sum = 0;
        for (int i = 0; i <= (size-1); i++) {
            System.out.print(arr1[i] + " ");
            sum = sum + i; // Sum of all elements in an array
        }
        System.out.println();

        System.out.println("Sum = " + sum);

        // for each loop to iterate over array
        int[] arr2 = {4, 5, 8, 10, 15 };

        for (int item: arr2) {
            System.out.print(item + " ");
        }

    }
}