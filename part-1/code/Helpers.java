/**
 * @Author: Parsa Rahimi <par5ul1>
 * @Date:   2021-03-07T22:36:12-08:00
 * @Filename: Helpers.java
 * @Last modified by:   par5ul1
 * @Last modified time: 2021-03-08T01:19:30-08:00
 */

public class Helpers {

  public static void swap(double [] arr, int i, int j) { // Helper function to swap two items in an array
    double temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static double [] makeCopyOf(double [] arr) {
    double [] newArr = new double [arr.length];
    for (int i = 0; i < arr.length; i++) {
      newArr[i] = arr[i];
    }
    return newArr;
  }

}
