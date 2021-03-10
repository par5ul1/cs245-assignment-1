/**
* @Author: Parsa Rahimi <par5ul1>
* @Date:   2021-03-09T18:12:10-08:00
* @Filename: HybridSort.java
 * @Last modified by:   par5ul1
 * @Last modified time: 2021-03-09T21:51:49-08:00
*/

import java.util.Random;

public class HybridSort {

  public void hybridsort(double [] arr, int left, int right) {

    double cutoff = 1000; // Arbitrarily selecting 0.1%

    if (left < right) { // If there has been no cross over.
      if (right - left > cutoff) { // If the length of the subarray is greater than the quicksort cutoff, perform a round of quicksort and call hybridsort again to see what to do next
        int pivot = quicksort(arr, left, right);
        hybridsort(arr, left, pivot-1);
        hybridsort(arr, pivot+1, right);
      } else { // Otherwise, good ol' insertion sort will help us
        quadraticsort(arr, left, right);
      }
    }

  }

  public void quadraticsort(double [] arr, int left, int right) { // insertion sort

    double tmp = arr[left]; // Start the temp variable at the first item

    for (int i = left+1; i < right+1; i++) { // Loop through the array starting at the second item and perform insertion sort

      int j = i-1;
      tmp = arr[i];

      while (j >= 0 && arr[j] > tmp) {
        arr[j+1] = arr[j];
        j--;
      }

      arr[j+1] = tmp;

    }
  }

  public int quicksort(double [] arr, int left, int right) { // quicksort is a bit of a misnomer. This is just the public version of partition

    return partition(arr, left, right); // partition the array and get the pivot

  }

  private int partition(double [] arr, int left, int right) {

    Random rng = new Random();

    int pivot = left; // Set the pivot equal to the starting index

    if (left < right) {

      int bot = left + 1;
      int top = right;

      int new_pivot = rng.nextInt((right+1)-left)+left;
      swap(arr, new_pivot, left); // Find a new pivot between left and right and swap it with whatever is it the first spot so we can deal with the rest of the array

      while (bot-1 < top) { // As long as the two pointers haven't crossed each other:
        while (bot <= right && arr[bot] <= arr[pivot]) { // While bot still has room to walk and bot is smaller that the pivot:
          bot++; // Walk bot to the right
        }
        while (top >= bot && arr[top] >= arr[pivot]) { // While top still has room to walk and top is larger than the pivot:
          top--; // Walk top to the left
        }
        if (bot <= right && bot < top) { // As long as there's no cross-over
          swap(arr, bot, top); // Make the swap
        }
      }

      swap(arr, pivot, top);
      pivot = top;
    }

    return pivot;

  }

  public static void swap(double [] arr, int i, int j) { // Helper function to swap two items in an array
    double temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

}
