package org.example.algo.practicum.yandex.dijkstra_algorithm_3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.example.algo.practicum.yandex.dijkstra_algorithm_3.Solution.countShortestPaths;
import static org.example.algo.practicum.yandex.dijkstra_algorithm_3.Solution.dijkstra;

public class Test {

    public static void main(String[] args) {
        Map<String, List<Node>> routs = new HashMap<>() {{
            put("A", List.of(new Node("B", 6), new Node("C", 1), new Node("A", 0)));
            put("B", List.of(new Node("C", 2), new Node("D", 3)));
            put("C", List.of(new Node("D", 1), new Node("E", 4)));
            put("D", List.of(new Node("E", 2)));
        }};

        //find the shortest paths from A to other Nodes.
        Map<String, Integer> stringIntegerMap = countShortestPaths(routs, "A");
        //must be {A=0, B=6, C=1, D=2, E=4}
        System.out.println(stringIntegerMap);


//        Map<String, Integer> a = dijkstra(routs, "A");
//        System.out.println(a);
    }
}
