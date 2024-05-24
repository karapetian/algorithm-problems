package org.example.algo.practicum.yandex.dijkstra_algorithm_2;

import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

//Given a graph and a source vertex in the graph,
//find the shortest paths from the source to all vertices in the given graph.
//https://www.youtube.com/watch?v=pVfj6mxhdMw
//Time Complexity: O( V + E logV )
//Space Complexity: O(V + E)
// E- number of edges; V- number of vertices
public class Solution {
    // Member variables of this class (counts distances)
    private int dist[];
    private Set<Integer> settled;
    private PriorityQueue<Node> pq;
    // Number of vertices
    private int V;
    List<List<Node>> adj;

    public Solution(int V) {
        this.V = V;
        dist = new int[V];
        settled = new HashSet<>();
        pq = new PriorityQueue<>(V, new Node());
    }

    public int[] getDist() {
        return dist;
    }

    // Dijkstra's Algorithm
    public void dijkstra(List<List<Node>> adj, int src) {
        this.adj = adj;

        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
        }

        // Add source node to the priority queue
        pq.add(new Node(src, 0));

        // Distance to the source is 0
        dist[src] = 0;

        while (settled.size() != V) {
            // Terminating condition check when
            // the priority queue is empty, return
            if (pq.isEmpty()) {
                return;
            }

            // Removing the minimum distance node from the priority queue
            int u = pq.remove().node;

            // Adding the node whose distance is finalized
            if (settled.contains(u)) {
                // Continue keyword skips execution for
                // following check
                continue;
            }

            // We don't have to call e_Neighbors(u)
            // if u is already present in the settled set.
            settled.add(u);
            e_Neighbours(u);
        }
    }

    // To process all the neighbours of the passed node
    private void e_Neighbours(int u) {
        int edgeDistance = -1;
        int newDistance = -1;
        // All the neighbors of v
        for (int i = 0; i < adj.get(u).size(); i++) {
            Node v = adj.get(u).get(i);

            // If current node hasn't already been processed
            if (!settled.contains(v.node)) {
                edgeDistance = v.cost;
                newDistance = dist[u] + edgeDistance;

                // If new distance is cheaper in cost
                if (newDistance < dist[v.node]) {
                    dist[v.node] = newDistance;
                }

                // Add the current node to the queue
                pq.add(new Node(v.node, dist[v.node]));
            }
        }
    }
}
