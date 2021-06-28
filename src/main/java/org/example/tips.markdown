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