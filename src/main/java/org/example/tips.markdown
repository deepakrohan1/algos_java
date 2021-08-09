# Arrays

* In java `array.length` and `string.length()`
* Working with strings to get charAt looping technique
```$xslt
for (int i = 0; i < str.length(); i++) {
    Character c = str.charAt(i);
}
```
* Comparing all the elements on the left of a index i

Naive solution to look at elements on left side.

```$xslt
for (int i =0; i < arr.length; i++) 
    for (int j = i -1 ; j >=0; j--)

[1,4,5,9]
i -> 3
j -> 2, 1, 0
```

# Table

HashTable

# Map

Building a Map and operations on it

```$xslt
Map<Character, Count> testMap = new HashMap<>();
// Put element into a map
testMap.put ('C', 1); 
// get an element from map
testMap.get('C')
// check for key
testMap.containsKey('C')
```

# Stack

Last In First Out 

```$xslt
Stack Class Ops
----------------
push
pop
peek
empty
search

Deque
-----
addFirst(e)         | offerFirst(e)
removeFirst()       | pollFirst()
getFirst()          | peekFirst()
addLast(e)          | offerLast(e)
removeLast()        | pollLast()
getLast()           | peekLast()
```

## Problems
* Stock Spanning Problems
* Find the previous greatest number
* Find the previous smallest number

# Arrays
## Circular Array

Given the position of the first element, get the position of next available space
```
_, 1, 3, 4, 5

size = 4 , cap = 5, front elementIndex = 1

(1 + 4) % 5 => 0

1, _, 4, 5, 6

front elementIndex = 4

(2+4) % 5 => 1
```

## K sub arrays looping pattern

on a `n` sized sub-array we need to create `k` sized sub array. Total number of combinations is `n - k + 1`