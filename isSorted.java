public class isSorted {
    public static boolean isSorted(int arr[], int n) {
        if (n == arr.length - 1) {
            return true;
        }
        if (arr[n] > arr[n + 1]) {
            return false;
        }
        return isSorted(arr, n + 1);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 3};
        boolean result = isSorted(arr, 0);
        System.out.println("Is the array sorted? " + result);
    }
}
