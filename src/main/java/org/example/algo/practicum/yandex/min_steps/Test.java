package org.example.algo.practicum.yandex.min_steps;

import java.util.HashSet;
import java.util.Set;

import static org.example.algo.practicum.yandex.min_steps.Solution.wordLadder;

public class Test {
    public static void main(String[] args) {
        String startWord = "cat";
        String endWord = "tap";
        Set<String> wordSet = new HashSet<>();
        wordSet.add("cat");
        wordSet.add("cap");
        wordSet.add("tab");
        wordSet.add("tap");

        int minSteps = wordLadder(startWord, endWord, wordSet);
        System.out.println("Минимальное количество шагов: " + minSteps);
    }
}
