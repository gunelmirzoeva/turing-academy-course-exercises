import java.util.Arrays;

public class BinarySeachWithRecursion {
    public static void main(String[] args) {
        int[] arr = {4,3,6,1,2,8,7,5};
        Arrays.sort(arr);
        int target = 9;
        if(binarySearch(arr, target, 0, arr.length - 1) != -1) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
    }
    public static int binarySearch(int[] arr, int target, int low, int high) {
        if(low > high) {
            return -1;
        }
        int mid = (high + low) / 2;

        if(arr[mid] == target) {
            return mid;
        } else if(arr[mid] > target) {
            return binarySearch(arr, target, low, mid - 1);
        } else {
            return binarySearch(arr, target, mid + 1, high);
        }

    }
}