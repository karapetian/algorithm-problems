package org.example.algo.practicum.yandex.dijkstra_algorithm;

public class Test {
    public static void main(String[] args) {
        Graph g = new Graph(5); // Create a graph with 5 vertices

        // Add edges to the graph
        g.addEdge(0, 1, 6);
        g.addEdge(0, 2, 1);
        g.addEdge(1, 2, 2);
        g.addEdge(1, 3, 3);
        g.addEdge(2, 3, 1);
        g.addEdge(2, 4, 4);
        g.addEdge(3, 4, 2);

        int source = 0; // Source node
        int dest = 4; // Destination node

        int[] result = g.dijkstra(source, dest);

        // Print the shortest distance and path
        System.out.println("Shortest distance from " + source + " to " + dest + ": " + result[0]);
        System.out.print("Shortest path: ");
        for (int i = 1; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
