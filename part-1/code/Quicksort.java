/**
 * @Author: Parsa Rahimi <par5ul1>
 * @Date:   2021-03-09T00:11:45-08:00
 * @Filename: Quicksort.java
 * @Last modified by:   par5ul1
 * @Last modified time: 2021-03-09T17:51:29-08:00
 */

public class Quicksort {

  public static void sort(double [] arr) {
    sort(arr, 0, arr.length-1);
  }

  private static void sort(double [] arr, int left, int right) {

    if (left < right) {

      int pivot = partition(arr, left, right); // partition the array and get the pivot
      sort(arr, left, pivot-1);
      sort(arr, pivot+1, right);

    }

  }

  private static int partition(double [] arr, int left, int right) {
    int pivot = left; // Make the first item the pivot

    if (left < right) {
      int bot = left + 1;
      int top = right;

      while (bot < top) { // As long as the two pointers haven't crossed each other:
        while (bot <= right && arr[bot] <= arr[pivot]) { // While bot still has room to walk and bot is smaller that the pivot:
          bot++; // Walk bot to the right
        }
        while (top >= bot && arr[top] >= arr[pivot]) { // While top still has room to walk and top is larger than the pivot:
          top--; // Walk top to the left
        }
        if (bot <= right && bot < top) { // As long as there's no cross-over
          Helpers.swap(arr, bot, top); // Make the swap
        }
      }

      Helpers.swap(arr, pivot, top);
      pivot = top;
    }

    return pivot;

  }

}
