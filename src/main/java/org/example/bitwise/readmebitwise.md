# Bitwise Operations

## AND &

`3 & 4`
this performs and operations between the bits
```$xslt
0011
0100
----
0000
``` 
## OR |
`3 and 4`
```$xslt
0011
0100
----
0111
```

## EXOR ^
if the bits are different returns `1` else `0`
`3 and 4`
```$xslt
0011
0100
----
0111
```

## NOT ~
It's a complement bitwise operations
`~ 3`
```$xslt
0011 -> 1100
```

## What is 2's complement?
To get the 2's complement flip 0 -> 1 and 1 -> 0 and add 1 to the number
```$xslt
28 number rep
0001 1100

-28
1110 0011
1110 0100
```

Representation 2^32 - x 
`~1`
```$xslt
 x: 000... 01
~x: 111... 10
-------------
    2^32 - 1 - 1
    2^32 - 2
-------------
# -2

Neg 5
 x: 000...0101
~x: 111...1010
---------------
    2^32 -1 -5
    2^32 -6
```

## Left Shift Operation <<

x << 1
```$xslt
0000...0011
<<1
0000..0110
<<2
0000..1100
```

## Brian Keringam's algorithm