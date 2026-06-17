public class ReverseArray {
    // function to reverse an array
    public static void revArray(int arr[]) {
        int first = 0, last = arr.length-1;

        while (first < last) {
            // swap
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            // update
            first++;
            last--;
        }
    }

    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10};
        
        revArray(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}