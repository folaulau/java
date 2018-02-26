1. DEFINITION
a. Simply put, the algorithm compares the key value with the middle element of the array; 
if they are unequal, the half in which the key cannot be part of is eliminated, and the 
search continues for the remaining half until it succeeds.

Remember – the key aspect here is that the array is already sorted.

If the search ends with the remaining half being empty, the key is not in the array.

b. Search a sorted array by repeatedly dividing the search interval in half. Begin with an 
interval covering the whole array. If the value of the search key is less than the item in 
the middle of the interval, narrow the interval to the lower half. Otherwise narrow it to 
the upper half. Repeatedly check until the value is found or the interval is empty.

We basically ignore half of the elements just after one comparison.

Compare x with the middle element.
If x matches with middle element, we return the mid index.
Else If x is greater than the mid element, then x can only lie in right half subarray after the mid element. So we recur for right half.
Else (x is smaller) recur for the left half.

2. LINKS
a. https://www.youtube.com/watch?v=P3YID7liBug