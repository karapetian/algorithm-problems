package org.example.algo.yandex.bfs.course_schedule;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//207. Course Schedule
//This problem can be modeled as a Directed Graph, where:
//Each course is a node.
//An edge from b to a indicates that course a depends on course b.
//The key is to check if this graph has a cycle:
//If there's a cycle, it's impossible to complete all courses.
//If there's no cycle, all courses can be completed
public class Solution {

    //int[][] input = {{0, 2}, {3, 1}, {2, 3}};
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        // Initialize adjacency list and in-degree array
        List<List<Integer>> graph = new ArrayList<>(); //course-index, refers to -value
        int[] inDegree = new int[numCourses]; //starting courses count

        // Build the graph
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] pair : prerequisites) {
            int course = pair[0];
            int prereq = pair[1];
            graph.get(prereq).add(course);
            inDegree[course]++;
        }

        // Initialize the queue with nodes having in-degree 0
        Queue<Integer> queue = new LinkedList<>(); //keep edge course that is a non-starting
        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0) {
                queue.offer(i);
            }
        }

        // Process the queue
        int completedCourses = 0;
        while (!queue.isEmpty()) {
            int current = queue.poll();
            completedCourses++;
            for (int neighbor : graph.get(current)) {
                inDegree[neighbor]--;
                if (inDegree[neighbor] == 0) {
                    queue.offer(neighbor);
                }
            }
        }

        // If all courses have been processed, return true
        return completedCourses == numCourses;
    }


    public static void main(String[] args) {
        int[][] input = {{0, 2}, {3, 1}, {2, 3}};
        System.out.println(canFinish(4, input));
    }
}
