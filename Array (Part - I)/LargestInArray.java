import java.util.*;
public class LargestInArray {
    // function to find largest in array
    public static int largestInArray(int arr[]) {
        int largest = Integer.MIN_VALUE; // -infinity

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    // function to find Smallest in array
    public static int smallestInArray(int arr[]) {
        int smallest = Integer.MAX_VALUE; // +infinity

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }

    public static void main(String args[]) {
        int numbers[] = {1, 2, 6, 3, 5};

        int largeValue = largestInArray(numbers);
        int smallValue = smallestInArray(numbers);

        System.out.println("Largest value is : " + largeValue);
        System.out.println("Smallest value is : " + smallValue);
    }
}