/**
 * @Author: Parsa Rahimi <par5ul1>
 * @Date:   2021-03-07T22:32:05-08:00
 * @Filename: SelectionSort.java
 * @Last modified by:   par5ul1
 * @Last modified time: 2021-03-08T01:14:35-08:00
 */

public class SelectionSort {

  public static void sort(double [] arr) {

    for (int i = 0; i < arr.length; i++) { // Loop through whole loop

      int min = i; // Track min index
      for (int j = i+1; j < arr.length; j++) { // Loop through whatever comes after the current item and see if they are the smallest
        min = arr[j] < arr[min] ? j : min; // Set the minimum
      }

      Helpers.swap(arr, i, min);

    }
  }

}
