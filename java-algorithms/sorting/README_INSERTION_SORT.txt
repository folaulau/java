1. DEFINITION
a. The insertion sort, unlike the other sorts, passes through the array only once.  
The insertion sort is commonly compared to organizing a handful of playing cards.  
You pick up the random cards one at a time.  As you pick up each card, you insert it 
into its correct position in your hand of organized cards.  

The insertion sort splits an array into two sub-arrays. The first sub-array 
(like the cards in your hand) is always sorted and increases in size as the sort continues. 
The second sub-array (like the cards to be picked up) is unsorted, contains all the elements 
yet to be inserted into the first sub-array, and decreases in size as the sort continues. 

The insertion sort maintains the two sub-arrays within the same array. 
At the beginning of the sort, the first element of the first sub-array is considered the "sorted array". 
With each pass through the loop, the next element in the unsorted second sub-array is placed into its proper position in the first sorted sub-array.

b. Insertion sort is a simple sorting algorithm, it builds the final sorted array one item at a time. 
It is much less efficient on large lists than other sort algorithms. 

Insertion sort iterates through the list by consuming one input element at each repetition, 
and growing a sorted output list. On a repetition, insertion sort removes one element from the 
input data, finds the location it belongs within the sorted list, and inserts it there. 
It repeats until no input elements remain.

Advantages of Insertion Sort: 

1) It is very simple.
2) It is very efficient for small data sets
3) It is very inefficient for large data sets

2. Runtime
Best case: O(N) - array already sorted
Worst/Average case: O(N^2)

The best case input is an array that is already sorted. 
In this case insertion sort has a linear running time (i.e., Θ(n)). 
During each iteration, the first remaining element of the input is only compared with the right-most 
element of the sorted subsection of the array. The simplest worst case input is an array sorted in 
reverse order. The set of all worst case inputs consists of all arrays where each element is the 
smallest or second-smallest of the elements before it. In these cases every iteration of the inner 
loop will scan and shift the entire sorted subsection of the array before inserting the next element. 
This gives insertion sort a quadratic running time (i.e., O(n2)). The average case is also quadratic, 
which makes insertion sort impractical for sorting large arrays. However, insertion sort is one of the 
fastest algorithms for sorting very small arrays, even faster than quicksort; indeed, good quicksort 
implementations use insertion sort for arrays smaller than a certain threshold, also when arising as 
subproblems; the exact threshold must be determined experimentally and depends on the machine, but is 
commonly around ten.

3. LINKS
a. https://www.youtube.com/watch?v=lCDZ0IprFw4
b. http://www.java2novice.com/java-sorting-algorithms/insertion-sort/