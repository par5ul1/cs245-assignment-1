/**
 * @Author: Parsa Rahimi <par5ul1>
 * @Date:   2021-03-07T23:05:06-08:00
 * @Filename: BubbleSort.java
 * @Last modified by:   par5ul1
 * @Last modified time: 2021-03-08T01:14:21-08:00
 */

public class BubbleSort {

  public static void sort(double [] arr) {

    for (int i = 0; i < arr.length; i++) { // Loop through the whole list

      boolean swapped = false; // See if any operations were performed this round
      for (int j = 0; j < arr.length-1; j++) { // Loop through items and compare them locally

        if (arr[j+1] < arr[j]) { // If two adjacent items are unsorted,
          Helpers.swap(arr,j,j+1); // sort them
          swapped = true; // Track the sort
        }

      }
      if (!swapped) { // If nothing was done, just leave. Nothing left to do.
        break;
      }

    }

  }

}
