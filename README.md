# Sorting algorithms: practical performance test

In this project I just wanted to test some sorting algorithms that are of interest to me.
The purpose of this is to compare the execution times of each algorithm with a list of random numbers with different sizes.

Now, I present the results together with the theoretical complexity using the notation big(O) and a short explanation of them
## Dual Pivot Quicksort
Dual pivot quick sort is a little bit faster than the original single pivot quicksort. The idea of dual pivot  is to take two pivots, one in the left end of the array and the second, in the right end of the array. The left pivot must be less than or equal to the right pivot, so we swap them if necessary.
### Big(O) complexity = O(n^2)
### Execution times
- Execution time with 100 elements = ` 8.686E-4` seconds.
- Execution time with 1,000 elements = `3.191E-4` seconds.
- Execution time with 10,000 elements = `8.274E-4` seconds.
---
## Quicksort
Quicksort is based on the divide and conquer approach where an array is divided into subarrays by selecting a pivot element.  
While dividing the array, the pivot element should be positioned in such a way that elements less than pivot are kept on the left side and elements greater than pivot are on the right side of the pivot.  
The left and right subarrays are also divided using the same approach. This process continues until each subarray contains a single element.  
At this point, elements are already sorted. Finally, elements are combined to form a sorted array.
### Big(O) complexity = O(n^2)
### Execution times
- Execution time with 100 elements = `5.01E-5` seconds.
- Execution time with 1,000 elements = `3.709E-4` seconds.
- Execution time with 10,000 elements = `0.0341278` seconds.
---
 ## Bubble Sort
Bubble sort is a sorting algorithm that compares two adjacent elements and swaps them until they are not in the intended order.  
### Big(O) complexity = O(n^2)
### Execution times
- Execution time with 100 elements = `1.809E-4` seconds.
- Execution time with 1,000 elements = `0.0047738` seconds.
- Execution time with 10,000 elements = `1.42E-4` seconds.
---
## Selection sort
Selection sort is a sorting algorithm that selects the smallest element from an unsorted list in each iteration and places that element at the beginning of the unsorted list.
### Big(O) complexity = O(n^2)
### Execution times
- Execution time with 100 elements = `8.37E-5` seconds.
- Execution time with 1,000 elements = `0.0023662` seconds.
- Execution time with 10,000 elements = ` 0.0470242` seconds.
---
## Conclusion
According to the results obtained by my computer these are the best algorithms based on the number of elements.  

| Number of elements | Algorithm            | Time |
|--------------------|----------------------|------|
| 100                | Quicksort            |5.01E-5|
| 1,000              | Dual Pivot Quicksort |3.191E-4 |
| 10,000             | ¿Bubblesort?         |1.42E-4 |  
As we can see the fastest algorithm was Quicksort. Curious, since, in theory, Dual Pivot Quicksort is a bit faster.  
Performing multiple runs I obtained different results, but the top positions were always between Quicksort and Dual Pivot Quicksort.