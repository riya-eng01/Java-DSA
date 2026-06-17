public class LinearSearch {
    // function for linear Serach
    public static int linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // return index
            }
        }
        return -1;
    }
    // function for 'String' Linear Search
    public static int linearSearch(String arr[], String key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    } 

    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 10;

        String menu[] = {"Dosa", "Samosa", "Chole Bhature", "Frooti"};
        String item = "Samosa";

        int index = linearSearch(numbers, key);
        if (index == -1) {
            System.out.println("Key not Found!");
        } else {
            System.out.println("Key is at index : " + index);
        }
    }
}