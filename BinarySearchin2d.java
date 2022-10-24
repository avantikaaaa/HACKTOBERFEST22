import java.util.Arrays;

public class BinarySearchin2d {
    public static void main(String[] args) {
        // A sample array
        int[][] arr = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 28, 29, 37, 49 },
                { 33, 34, 38, 40 } };
        System.out.println(Arrays.toString(search(arr, 37)));
    }

    static int[] search(int[][] array, int target) {
        int row = 0, col = array.length - 1;
        while (row < array.length || col >= 0) {
            if (array[row][col] == target) {
                return new int[] { row, col };      // Element found
            } else if (array[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }
        return new int[] { -1, -1 };      // Element not found
    }
}
