# Assignment 1 - Sorting
## Part 1 - Sorting Running Times

The Google Sheets used to generate the plot below can be found [here](https://docs.google.com/spreadsheets/d/1jjlxZDagaoYZiipNvu4UlqwnvfVWXzp3PuoPOLTdgFA/edit?usp=sharing).

The generated plot:

![](part-1/result.png)

---
## Part 2 - Quicker than Quicksort

Hybrid Sort is a sorting algorithm which merges Quicksort, an average case O(nlogn) algorithm, with Insertion Sort, an average O(n^2) algorithm. This is done because for small n values, the probability of running Quicksort at its worst case becomes higher.

For Quicksort, the worst case happens when the selected pivot is always the smallest or largest value so for example, in the case of an already sorted array (ascending or descending), Quicksort runs in quadratic time if the pivot is always the first or last element. Random Pivot Quicksort does decrease the probability of getting the extreme value but for small enough array sizes, it will still become fairly likely.

Using the above, one can say that for any given array, the probability of a randomly selected pivot being an extreme is 2/*n* (but this will be simplified to 1/*n* for argument's sake), where *n* is the size of that array. Therefore, the threshold for when it is best to stop using Quicksort and switch over to Insertion Sort should be some number *n*, such that 1/*n* is "small enough". For this program, that number was arbitrarily picked to be 1000 because that yields a probability of 0.001 or 0.1%. This means there's less than 1% chance that any given pivot is the smallest or largest.

As for why Insertion Sort was chosen, it is because it is by far the fastest O(n^2) algorithm we know (as highlighted by [the graph](part-1/result.png) in Part 1).

**Hybrid Sort Running Time:** O(nlogn) – For large enough *n*, Quicksort does most of the work at O(nlogn) time and sub-arrays are all of size ≤ 1000 so they are considered to be relatively constant time.

**Hybrid Sort Space Complexity:** O(1) — All operations are handled on the input array.
