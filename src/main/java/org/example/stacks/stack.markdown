# Stack Data Structure
Last in first out data structure

```$xslt
1, 2, 3

stack.push(1) 
________
1  |

stack.push(3)
_______
3 | 1

stack.push(2)
___________
2 | 3 | 1 | 
```

## Operations in Java
You can 
* add operation `push`
* remove operation `pop`
* look at top element `peek`
* size of stack `size`
* check for emptiness `isEmpty`

## Exception Conditions
_Underflow_ When pop or peek is called on stack

_Overflow_ Happens when you push to the max limit of size

## Applications
* Functions Calls
* Balanced Parenthesis
* Postfix and Prefix expressions

## Stack In Java

This is supported by List -> Vector -> `Stack` and Queue -> `Deque` class

Prefer Deque over Stack class. 

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
