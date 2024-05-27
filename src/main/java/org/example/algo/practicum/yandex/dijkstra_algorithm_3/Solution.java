package org.example.algo.practicum.yandex.dijkstra_algorithm_3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

//My impl of the Dijkstra's Algo
//{A=0, B=6, C=1, D=2, E=4}
public class Solution {

    //mine
    static Map<String, Integer> countShortestPaths(Map<String, List<Node>> routs, String sourceNodeName) {
        Map<String, Integer> results = new HashMap<>();
        routs.entrySet()
                .stream()
                .map(entry -> entry.getValue())
                .flatMap(nodes -> nodes.stream())
                .forEach(node -> results.put(node.getName(), -1));


        for (Map.Entry<String, List<Node>> entry : routs.entrySet()) {
            String parentNodeName = entry.getKey();
            List<Node> neighbours = entry.getValue();

            for (int i = 0; i < neighbours.size(); i++) {
                Node neighbour = neighbours.get(i);
                String neighbourName = neighbour.getName();
                int cost = neighbour.getCost();
                int newCost = cost + results.get(parentNodeName);

                Integer oldCost = results.get(neighbourName);
                if (oldCost == -1) {
                    results.put(neighbourName, cost);
                } else if (newCost < oldCost) {
                    results.put(neighbourName, newCost);
                }
            }
        }
        return results;
    }

    static Map<String, Integer> dijkstra(Map<String, List<Node>> graph, String source) {
        Map<String, Integer> distances = new HashMap<>();
        PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> a.getCost() - b.getCost());

        // Initialize distances
        for (String node : graph.keySet()) {
            distances.put(node, Integer.MAX_VALUE);
        }
        distances.put(source, 0);

        pq.offer(new Node(source, 0));

        while (!pq.isEmpty()) {
            Node current = pq.poll();
            String currentNode = current.getName();

            // If the current node has already been processed, skip it
            if (current.getCost() > distances.get(currentNode)) {
                continue;
            }

            // Process the neighbors of the current node
            for (Node neighbor : graph.get(currentNode)) {
                int newDistance = distances.get(currentNode) + neighbor.getCost();

                // If the new distance is shorter or the neighbor hasn't been visited yet
                if (newDistance < distances.getOrDefault(neighbor.getName(), Integer.MAX_VALUE)) {
                    distances.put(neighbor.getName(), newDistance);
                    pq.offer(new Node(neighbor.getName(), newDistance));
                }
            }
        }

        return distances;
    }
}
