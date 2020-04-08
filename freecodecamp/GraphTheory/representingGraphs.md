# Reprensenting Graphs

## Adjacency Matrix

The idea is that the cell `m[i][j]` reprents the edge weight of going from node i to node j.

I guess that this graph is:

- __Directed__ because the orientation matters. In this example, is not the same going from `matrix[0][1]` than `matrix[1][0]`. The values are 4 for the first case and for the second case are 3 weights.

- __Weighted__ because we are using weights to calculate the cost from going to one node to the other.

- The cost of going from one node to itself is 0.

```
[    A  B  C  D
  A [0, 4, 1, 9],
  B [3, 0, 6, 11],
  C [4, 1, 0, 2],
  D [6, 5, -4, 0]
]
```

| Pros | Cons |
| ---- | ---- |
| Space efficient for representing __dense graphs__ | Requires _O(V^2)_ space |
| Edge weight lookup is _O(1)_ | Iterating over all edges takes _O(V^2)_ time |
| Simplest graph reprensentation |  |

## Adjacency List

It is a way of represent a graph as a map from nodes to lists of edges.

```
    A -> [(B,4), (C,1)]
    B -> [(C,6)]
    C -> [(A,4), (B,1), (D,2)]
    D -> []
```

| Pros | Cons |
| ---- | ---- |
| Space efficient for representing sparse graphs | less space efficient for denser graphs. |
| Iterating over all edges is efficient | Edge weight lookup is O(E) |
|  | Slightly more complex graph representation |

## Edge List

An edge list is a way to represent a graph simply as an unordered list of edges. Assume the notation for any triplet (u, v, w) means: "The cost from node u to node v is w"

```
[
    (A, C, 1), (C, A, 4),
    (B, C, 6), (C, B, 1),
    (C, D, 1),
    (A, B, 4)
]
```

note: It is conceptually simple and practical in a handful of algorithms

| Pros | Cons |
| ---- | ---- |
| Space efficient for representing sparse graphs | Less space efficient for denser graphs. |
| Iterating over all edges is efficient | Edge weight loopkup is O(E) |
|  Very simple structure |  |
