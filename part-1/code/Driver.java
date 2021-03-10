/**
 * @Author: Parsa Rahimi <par5ul1>
 * @Date:   2021-03-07T23:03:52-08:00
 * @Filename: Driver.java
 * @Last modified by:   par5ul1
 * @Last modified time: 2021-03-09T14:30:34-08:00
 */

import java.util.Random;

public class Driver {

  public static void main(String[] args) {

    Random rng = new Random();

    System.out.println("Size,Selection Sort,Bubble Sort,Insertion Sort,Merge Sort,Quicksort");

    for (int i = 50000; i <= 500000; i+=50000) {

      double [][] arrs = new double [5][i];
      double [] arr = new double [i];
      double [] times = new double [5];

      for (int j = 0; j < i; j++) {
        arr[j] = rng.nextDouble();
      }
      for (int j = 0; j < arrs.length; j++) {
        arrs[j] = Helpers.makeCopyOf(arr);
      }

      double start = 0;
      double end = 0;
      // selectionSort
      start = System.currentTimeMillis();
      SelectionSort.sort(arrs[0]);
      end = System.currentTimeMillis();
      times[0] = end-start;
      // bubbleSort
      start = System.currentTimeMillis();
      BubbleSort.sort(arrs[1]);
      end = System.currentTimeMillis();
      times[1] = end-start;
      // insertionSort
      start = System.currentTimeMillis();
      InsertionSort.sort(arrs[2]);
      end = System.currentTimeMillis();
      times[2] = end-start;
      // mergeSort
      start = System.currentTimeMillis();
      MergeSort.sort(arrs[3]);
      end = System.currentTimeMillis();
      times[3] = end-start;
      // quickSort
      start = System.currentTimeMillis();
      Quicksort.sort(arrs[4]);
      end = System.currentTimeMillis();
      times[4] = end-start;

      System.out.print(i+",");
      for (int j = 0; j < times.length; j++) {
        System.out.print(times[j]+(j==times.length-1?"":","));
      }
      System.out.println();

    }

  }

}
