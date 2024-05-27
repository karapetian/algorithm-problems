package org.example.algo.practicum.yandex.dijkstra_algorithm;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Graph {

    private int V;  // Number of vertices
    private LinkedList<Edge>[] linkedlistArr;

    static class Edge {
        int dest;
        int weight;

        Edge(int dest, int weight) {
            this.dest = dest;
            this.weight = weight;
        }
    }

    public Graph(int V) {
        this.V = V;
        linkedlistArr = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            linkedlistArr[i] = new LinkedList<>();
        }
    }

    void addEdge(int src, int dest, int weight) {
        linkedlistArr[src].add(new Edge(dest, weight));
    }

    // Dijkstra's algorithm to find the shortest path
    int[] dijkstra(int source, int dest) {
        int[] dist = new int[V]; // Shortest distance from source
        int[] prev = new int[V]; // Previous vertex in the shortest path
        boolean[] visited = new boolean[V]; // Track visited vertices

        // Initialize distances and previous vertices
        Arrays.fill(dist, Integer.MAX_VALUE);
        Arrays.fill(prev, -1);
        dist[source] = 0;

        // Create a priority queue to get the vertex with the minimum distance
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> dist[a] - dist[b]);
        pq.offer(source);

        while (!pq.isEmpty()) {
            int u = pq.poll();

            if (visited[u]) {
                continue;
            }

            visited[u] = true;

            // Update distances of adjacent vertices
            for (Edge edge : linkedlistArr[u]) {
                int v = edge.dest;
                int weight = edge.weight;

                if (dist[v] > dist[u] + weight) {
                    dist[v] = dist[u] + weight;
                    prev[v] = u;
                    pq.offer(v);
                }
            }
        }

        // Reconstruct the shortest path
        LinkedList<Integer> path = new LinkedList<>();
        int curr = dest;
        while (curr != -1) {
            path.addFirst(curr);
            curr = prev[curr];
        }

        // Prepare the result array
        int[] result = new int[path.size() + 1];
        result[0] = dist[dest];
        int i = 1;
        for (int node : path) {
            result[i++] = node;
        }

        return result;
    }
}
