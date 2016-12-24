# -*- coding: utf-8 -*-
"""Program to calculate and print the maximum total value of matrix, A for a given tree, T."""


def dfs(graph, start, n, edge_dist):
    """Function to implement DFS in the graph."""
    visited, stack = set(), [start]
    distances = [-1] * n
    distances[int(start) - 1] = 0

    while stack:
        vertex = stack.pop()
        if vertex not in visited:
            visited.add(vertex)
            for v in graph[vertex]:
                if distances[int(v) - 1] == -1:
                    distances[int(v) - 1] = distances[int(vertex) - 1] + min(edge_dist[tuple([vertex,v])])
            stack.extend(graph[vertex] - visited)
    return filter(lambda x: x != -1, distances)

n = int(input())  # no. of nodes
graph = dict()
edge_dist = dict()
for r in range(n - 1):
    # taking input from stdin
    a, b, c = map(int, input().split())
    # making graph and edge distances
    graph.setdefault(a, set()).add(b)
    graph.setdefault(b, set()).add(a)
    edge_dist.setdefault(tuple([a, b]), list()).append(c)
    edge_dist.setdefault(tuple([b, a]), list()).append(c)

sol = dfs(graph, 1, n, edge_dist)
sol2 = dfs(graph, n, n, edge_dist)
print(min(sum(sol), sum(sol2)))
