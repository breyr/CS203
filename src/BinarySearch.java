public class BinarySearch {

    private static int search(int[] arr, int target, int lower, int upper) {
        // check what side of the array the search element is in

        if (lower > upper) {
            return -1;
        }

        int mid = (lower + upper) / 2; // index
        int val = arr[mid];

        if (target == val) {
            return mid;
        } else if (target < val) { // going to the left
            return search(arr, target, lower, mid - 1);
        } else {
            return search(arr, target, mid + 1, upper);
        }
    }

    public static int arraySearch(int[] arr, int target) {
        // Don't mess with original function
        // Do not want to change an array because that's additional memory
        return search(arr, target, 0, arr.length - 1);
    }

    public static void main(String[] args) {

    }
}
