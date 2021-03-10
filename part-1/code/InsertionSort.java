/**
 * @Author: Parsa Rahimi <par5ul1>
 * @Date:   2021-03-07T23:17:27-08:00
 * @Filename: InsertionSort.java
 * @Last modified by:   par5ul1
 * @Last modified time: 2021-03-08T01:14:30-08:00
 */

public class InsertionSort {

  public static void sort(double [] arr) {

    double tmp = arr[0]; // Start the temp variable at the first item

    for (int i = 1; i < arr.length; i++) { // Loop through the array starting at the second item and perform insertion sort

      int j = i-1;
      tmp = arr[i];

      while (j >= 0 && arr[j] > tmp) {
        arr[j+1] = arr[j];
        j--;
      }

      arr[j+1] = tmp;

    }

  }

}
