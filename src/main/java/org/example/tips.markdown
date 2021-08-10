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

# Binary Search

Search for element in logN time

```$xslt
 public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
                if (nums[mid] == target)
                    return mid;
                else if (nums[mid] < target) {
                   low = mid + 1;

               }  else if (nums[mid] > target) {
                   high = mid - 1;

               }
        }
        return low;
    }
```
# Floyd's Cycle Finding Algorithm

Use pointers at variable speed. The slow pointer moves 1 step at a time and the fast pointer moves 2 steps at a time.

We break down the movement of the slow pointer into two steps, the non-cyclic part and the cyclic part:

The slow pointer takes "non-cyclic length" steps to enter the cycle. At this point, the fast pointer has already reached the cycle. 
```$xslt
  {Number of iterations} = {non-cyclic length} = N

```
    

Both pointers are now in the cycle. Consider two runners running in a cycle - the fast runner moves 2 steps while the slow runner moves 1 steps at a time. Since the speed difference is 1, it takes 

{distance between the 2 runners}{difference of speed} 

​
loops for the fast runner to catch up with the slow runner. As the distance is at most "\text{cyclic length K}cyclic length K" and the speed difference is 1, we conclude that
\text{Number of iterations} = \text{almost}Number of iterations=almost "\text{cyclic length K}cyclic length K".

Therefore, the worst case time complexity is O(N+K)O(N+K), which is O(n)O(n).

Space complexity : O(1)O(1). We only use two nodes (slow and fast) so the space complexity is O(1)O(1).