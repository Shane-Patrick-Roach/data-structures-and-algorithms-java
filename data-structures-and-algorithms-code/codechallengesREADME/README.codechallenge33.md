# Challenge Summary

Write a function that `LEFT JOINs` two hashmaps into a single data structure.

`Arguments`: Two Hash Maps

`Return`: Collection of left joined values of each hashmap.

## Whiteboard Process
![Code Challenge 33 Diagram](../lib/images/Java_CodeChallenge33.png)

## Approach and Efficiency

The approach I took was to create a new list to hold the results of the left join values. This is an array list of array lists. 
Then the keys were gathered from the first hash map (the hash map that is left joining values) using the `.keys()` method.
For each key the following key, value in first hashmap, and value in second hashmap were added to a new arraylist. The new arraylist was then added to
the results arraylist declared at the beginning of the function. If the value for the given key in the second hashmap
was missing, null was added to the array list. 

The big O runtime efficiency is approximately O(n). The runtime grows in proportion to the size of keys in hashmap One.
The big O space efficiency is O(n), since a new arraylist of values must be generated (closer to o(3n)). 

## Solution

- `leftJoinTest`
- `leftJoinTestMissingValues`
- `leftJoinTestEmptySecondHashmap`
- `leftJoinTestSameHashmap`
- `leftJoinTestEmptyHashmap`

