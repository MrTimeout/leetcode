# Graph glossary

## A Graph

It is a set of __vertices__ plus a set of __edges__ that connect pairs of distinct vertices 
(with at most one edge connecting an pair of vertices).

The range for a V-vertex graph are from 0...V-1

Elements:

- V -> number of vertices.

- E -> number of edges.

Technical simplifications:

+ It disallows duplicate edges (__parallel edges__, and a grah that contain them as a __multigraph__)

+ It disallows edges that connect vertices to themselves; such edges are called __self-loops__.

Graphs that have no parallel edges or self-loops are sometimes referred to as simple graphs.

## Number of vertices

A graph with V vertices has at most V (V - 1)/2 edges.

## Nomenclature

Mathematicians use the words vertex == node interchangeably.
We generally use vertex when discussing graphs and node when discussing representations.

The words arc, edge and link are all widely used by mathematicians to describe the abstraction embodying a connection between two vertices, but we consistenly use edge when discussing graphs and link when discussing C data structures.

## Adjacent

When there is an edge connecting two vertices, we say the vertices are adjacent to one another and that the edge is incident on both vertices.

## Degree

The degree of a vertex is the number of edges incident on it. v-w means that the vertex v connects with W using and edge.

## Planar graph

It is one that can be drawn in the plane without any edges crossing.

## Euclidean graphs

A graph drawing can carry considerable information because the vertices correpond to points in the plane and the distances between 
them are relevant.
