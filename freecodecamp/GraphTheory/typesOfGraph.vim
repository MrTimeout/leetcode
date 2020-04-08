# Overview of Graph theory

## Undirected Graph

An undirected graph is a graph in which edges have no orientation. The edge (u, v) is identical to the edge (v, u).

## Directed Graph

A directed graph or diagraph is a graph in which edges have orientations. For example, the edge (u, v) is the edge from node u to node v.

## Weighted Graphs

Many graphs can have dges that contain a certain weight to represent an arbritary value such as cost, distance, quantity, etc.

Note: I will usually denote an edge of such graph as a triplet (u, v, w) and specify whether the graph is directed or undirected.

## Trees

A tree is an undirected graph with no cycles. Equivalently, it is a connected graph with N nodes and N-1 edges.

## Rooted Trees

A rooted tree is a tree with a designated root node where every edge either points away from or towards the root node. When edges point away from the root, the graph is called an __arborescence (out-tree)__ and __anti-arborescence (int-tree)__ otherwise.

int-tree: `x -> root <- y <- z`
out-tree: `x <- root -> y -> z`

## Directed Acyclic Graphs (DAGs)

DAGs are directed graphs with no cycles. These graphs play an important role in representing structures with dependencies. Several efficient algorithms exist to operates on DAGs.

cool fact: All out-trees are DAGs but not all DAGs are out-trees.

## Bipartite Graph

A bipartitie graph is one whose vertices can be split into two independent groups U, V such that every edge connects between U and V.
Other definitions exists such as: The graph is two colourable or these is no odd length cycle.

## Complete graphs

The worst to get good performance. All nodes are connected, basically
