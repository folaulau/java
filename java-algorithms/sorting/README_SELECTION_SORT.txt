1. DEFINITION
a. The selection sort is a combination of searching and sorting. During each pass, the unsorted element 
with the smallest (or largest) value is moved to its proper position in the array. The number of times 
the sort passes through the array is one less than the number of items in the array. In the selection 
sort, the inner loop finds the next smallest (or largest) value and the outer loop places that value 
into its proper location.

b. The selection sort algorithm sorts an array by repeatedly finding the minimum element 
(considering ascending order) from unsorted part and putting it at the beginning. The algorithm 
maintains two subarrays in a given array.

1) The subarray which is already sorted.
2) Remaining subarray which is unsorted.

In every iteration of selection sort, the minimum element (considering ascending order) from the 
unsorted subarray is picked and moved to the sorted subarray.

c. This more efficient variation of selection sort remembers the index of the smallest element that 
it finds in each pass. At the end of each pass it makes one exchange, if necessary. 
This is more efficient, but you shouldn't be writing your own sort - use java.util.Arrays.sort(...) or 
java.util.Collections.sort(...)!

2. Runtime
Worst case performance : О(n^2)
Best case performance : O(n^2)
Average case performance : О(n^2)

3. LINKS
a. http://www.sanfoundry.com/java-program-implement-selection-sort/
b. https://www.youtube.com/watch?v=cqh8nQwuKNE