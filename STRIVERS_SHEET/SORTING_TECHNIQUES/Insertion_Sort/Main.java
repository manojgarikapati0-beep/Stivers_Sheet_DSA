package STRIVERS_SHEET.SORTING_TECHNIQUES.Insertion_Sort;

import java.util.Arrays;

class Solution {
    public static int[] insertion_sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i;

            // Shift elements that are greater than temp to one position ahead
            while (j > 0 && temp < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }

            // Place temp at its correct position
            arr[j] = temp;
        }
        return arr;
    }
}

public class Main {
    public static void main(String args[]) {
        int[] arr = {34, 76, 8, 5, 3, 5, 76, 8};
        int[] result = Solution.insertion_sort(arr);
        System.out.println(Arrays.toString(result));
    }
}