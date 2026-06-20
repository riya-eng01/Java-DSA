public class Practice {
    // functio for linear Search
    public static int linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1; // key not found
    }

    // linear Search for String array
    public static int linearSearch(String arr[], String key) {
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    // function to find largest in a given array
    public static int largestInArray(int arr[]) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 10;

        // String array
        String fruits[] = {"apple", "banana", "orange"};
        String item = "orange";

        // int index = linearSearch(numbers, key);
        int index = linearSearch(fruits, item);

        if (index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Key is at index : " + index);
        }

        // largest
        int nums[] = {1, 2, 6, 3, 5};
        int largeNumber = largestInArray(nums);
        System.out.println("Largest num: " + largeNumber);
    }
}