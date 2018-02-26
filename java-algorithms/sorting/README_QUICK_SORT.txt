1. DEFINITION
a. Quicksort or partition-exchange sort, is a fast sorting algorithm, which is 
using divide and conquer algorithm. Quicksort first divides a large list into 
two smaller sub-lists: the low elements and the high elements. Quicksort can then 
recursively sort the sub-lists.

Steps to implement Quick sort:

i) Choose an element, called pivot, from the list. 
	Generally pivot can be the middle index element.
ii) Reorder the list so that all elements with values less than the pivot come 
	before the pivot, while all elements with values greater than the pivot come 
	after it (equal values can go either way). After this partitioning, the pivot 
	is in its final position. This is called the partition operation.
iii) Recursively apply the above steps to the sub-list of elements with smaller 
	values and separately the sub-list of elements with greater values.


2. Runtime - performance depends large on the pivot
Best case: O(n log(n))
Worst case: O(N^2)
Average case: O(n log(n))

3. LINKS
a. http://mathbits.com/JavaBitsNotebook/Arrays/QuickSort.html
b. https://www.youtube.com/watch?v=B4URnLNITgw
c. https://www.youtube.com/watch?v=SLauY6PpjW4
d. 
