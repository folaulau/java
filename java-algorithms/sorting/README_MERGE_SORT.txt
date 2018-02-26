1. DEFINITION
a. During the Mergesort process the objects of the collection are divided into two collections. 
To split a collection, Mergesort will take the middle of the collection and split the collection into 
its left and its right part.

The resulting collections are again recursively sorted via the Mergesort algorithm.

Once the sorting process of the two collections is finished, the result of the two collections 
is combined. To combine both collections Mergesort starts in each collection at the beginning. 
It picks the object which is smaller and inserts this object into the new collection. 
For this collection it now selects the next elements and selects the smaller element from both collections.

Once all elements from both collections have been inserted in the new collection, Mergesort has 
successfully sorted the collection.

* Quicksort can sort "inline" in an existing collection, e.g. it does not have to create a copy of 
the collection while Mergesort requires a copy.

b. 

2. Runtime
Best case: O(N Log N)
Worst case: O(N Log N)
Average case: O(N Log N)

3. LINKS
a. https://www.youtube.com/watch?v=iMT7gTPpaqw
b. 