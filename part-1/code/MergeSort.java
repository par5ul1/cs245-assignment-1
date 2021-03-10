/**
 * @Author: Parsa Rahimi <par5ul1>
 * @Date:   2021-03-08T23:06:58-08:00
 * @Filename: MergeSort.java
 * @Last modified by:   par5ul1
 * @Last modified time: 2021-03-09T00:19:06-08:00
 */

public class MergeSort {

  public static void sort(double [] arr) {

    if (arr.length > 1) {

      double [] left = split_left(arr);
      double [] right = split_right(arr);

      sort(left);
      sort(right);
      merge(arr, left, right);
    }

  }

  private static void merge(double [] arr, double [] left, double[] right) {
    int i = 0; // Left index
    int j = 0; // Right index
    int k = 0; // Array index

    while (i < left.length && j < right.length) { // Merge from both arrays
      if (left[i] <= right[j]) {
        arr[k++] = left[i++];
      } else {
        arr[k++] = right[j++];
      }
    }

    while (i < left.length) { // Copy left leftovers
      arr[k++] = left[i++];
    }
    while (j < right.length) { // Copy right leftovers
      arr[k++] = right[j++];
    }

  }

  private static double [] split_left(double [] arr) {
    int midpoint = arr.length/2; // Find the midpoint
    double left [] = new double [midpoint]; // Create the left array

    for (int i = 0; i < midpoint; i++) {
      left[i] = arr[i]; // Copy the values
    }
    return left;
  }

  private static double [] split_right(double [] arr) {
    int midpoint = arr.length/2; // Find the midpoint
    double right [] = new double [arr.length-midpoint]; // Create right array

    for (int i = midpoint; i < arr.length; i++) {
      right[i-midpoint] = arr[i]; // Copy the values
    }
    return right;
  }

  // public static void main(String[] args) {
  //   MergeSort m = new MergeSort();
  //   double [] arr = {1,2,3,4,5,6,7};
  //   double [] arr_l = m.split_left(arr);
  //   double [] arr_r = m.split_right(arr);
  //   for (double a :arr_l ) {
  //     System.out.print(a+" ");
  //   }
  //   System.out.println();
  //   for (double a :arr_r ) {
  //     System.out.print(a+" ");
  //   }
  // }

}
