package org.example.algo.practicum.yandex.dijkstra_algorithm_3;

class Node {

    private String name;
    private int cost;

    public Node() {
    }

    public Node(String node, int cost) {
        this.name = node;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
