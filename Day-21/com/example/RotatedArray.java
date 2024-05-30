/**
 * RotatedArray
 */
public class RotatedArray {

    public static int search(int arr[], int target, int si, int ei) {
        if (si > ei) {
            return -1;
        }
        // work
        int mid = si + (ei - si) / 2;

        if (arr[mid] == target) {
            return mid;
        }
        // Mid on L1
        if (arr[si] <= arr[mid]) {
            // case-1
            if (arr[si] <= target && target <= arr[mid]) {
                return search(arr, target, si, mid - 1);
            }
            // case-2
            else {
                return search(arr, target, mid + 1, ei);
            }
        }
        // Mid on L2
        else {
            // case - 3
            if (arr[mid] <= target && target <= arr[ei]) {
                return search(arr, target, mid + 1, ei);
            }
            // case-4
            else {
                return search(arr, target, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 1, 2, 3 };
        int target = 3;
        int tarIDX = search(arr, target, 0, arr.length - 1);
        System.out.println(tarIDX);
    }
}