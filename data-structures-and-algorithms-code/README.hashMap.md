# Hashtables

## Challenge

Implement a hash table with the following methods; set, get, contains, keys, and hash.

## Approach & Efficiency

The data structure was implemented using an array list as the bucket, which contained a linked list for each of the array list's elements.
The nested linked list was composed of `Hash map pairs`. Hash map pairs consist of a key and value. To hash the key into a valid index, the `hashCode()` method from java.util.hashmap
library was used. 

The time complexity of `set`, `get`, `contains`, and `keys` are O(1). The time complexity comes down to the effectiveness of the hash function, which correlates to how evenly it distributes the data
 across the array list. The space complexity of hash map is O(n) which grows in relation to the size of inputs (entries). 

## API

### set
- Arguments: key, value 
- Returns: nothing
- This method should hash the key, and set the key and value pair in the table, handling collisions as needed.
Should a given key already exist, replace its value from the value argument given to this method.

### get
- Arguments: key
- Returns: Value associated with that key in the table 

### contains
- Arguments: key
- Returns: Boolean, indicating if the key exists in the table already.

### keys
- Returns: Collection of keys

### hash
- Arguments: key
- Returns: Index in the collection for that key

## Tests

- `testHashMapSetSize`
- `testHashKey`
- `testHashSetSingleKeyValue`
- `testHashSetMultipleKeyValue`
- `testHashGetKeyValue`
- `testHashGetKeyValueNegative`
- `testHashMapContainsKey`
- `testHashMapContainsKeyNegative`
- `testHashMapCollectionKeys`
- `testHashMapCollectionKeysDuplicates`


## Notes

- Hash Tables are collections of key-value pairs.
- Hash Tables can find values quickly given a key.
- Hash Tables can add new-key values quickly.
- Hash Tables store data in a large array, and work by hashing the keys.
- A good hash should be fast, distribute keys uniformly, and be deterministic. 



## Resources/Citations
- Ed Younskevicius for starting code.

