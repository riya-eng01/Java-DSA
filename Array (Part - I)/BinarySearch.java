public class BinarySearch {
    // function for binary Search
    public static int binarySearch(int arr[], int key) {
        int start = 0, end = arr.length-1; 

        while (start <= end) {
            int mid = (start + end) / 2;

            if(arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) { //right
                start = mid + 1;
            } else { // left
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;

        int index = binarySearch(numbers, key);

        if (index == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key is at : " + index);
        }
    }
}