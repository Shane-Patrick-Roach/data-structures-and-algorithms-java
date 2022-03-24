# Quick Sort Blog Post

- Like merge sort, exploits the fact that arrays of 0 or 1 element are always sorted.


## Overall Algorithm

### Pivot Helper

- A helper function that designates an element as the pivot. Should do it in place, not make a new array.
- Picking a pivot, the runtime of quick sort depends in part on how one selects the pivot. For this case we will pick the first element
as the pivot for simplicity.
- The pivot rearranges the array and makes sure that every element less than the pivot is on the left side, but it does not make sure all the elements on the left side
are in the correct spot. Only the pivot is in the correct spot for-sure. 

### Quicksort

- Call the pivot helper on the array.
- When the helper returns the updated pivot index, we recursively call the pivot helper on the left and right sub-arrays of that index.
- The base case is anything with less than two elements. If left and right are equal.
- The function should accept three arguments; the array, sub-array of left side, and sub-array of right side.


### Swap Helper

- Swap will be used to switch the corresponding elements with each other.


## Process

Example input of `[8,4,23,42,16,15]`.



### Conclusion

The Big O of quicksort has the following time and space complexities. In the worst case scenario for time complexity we get a big O of (n2), if the array is almost entirely sorted. 
The best case scenario would be O (n log(n)). The space complexity would be o(log n). 


## Tests

## Notes

## Resources

- [Data Structures Course](https://www.udemy.com/course/js-algorithms-and-data-structures-masterclass/learn/lecture/11072020#learning-tools)
