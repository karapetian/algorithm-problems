package org.example.algo.practicum.yandex.min_steps;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

//Задача: дан набор слов, стартовое и конечное слово. За один ход можно взять текущее слово и заменить его на любое другое
//из этого набора, если они отличаются ровно на один символ. Например, дан набор[”cat”, “cap”, “tab”, “tap”],
//начальное слово “cat”, конечное — “tap”. Можно совершить цепочку преобразований “cat” → “cap” → “tap”, а
//“cap” → “tab” → “tap” нельзя, поскольку “cap” и “tab” отличаются не в одном символе.
//За какое наименьшее число ходов можно превратить стартовое слово в конечное?
public class Solution {

    public static int wordLadder(String start, String end, Set<String> wordSet) {
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        queue.offer(start);
        visited.add(start);
        int steps = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                String word = queue.poll();

                if (word.equals(end)) {
                    return steps;
                }

                for (int j = 0; j < word.length(); j++) {
                    char[] chars = word.toCharArray();

                    for (char c = 'a'; c <= 'z'; c++) {
                        chars[j] = c;
                        String newWord = new String(chars);

                        if (wordSet.contains(newWord) && !visited.contains(newWord)) {
                            queue.offer(newWord);
                            visited.add(newWord);
                        }
                    }
                }
            }

            steps++; // Увеличиваем steps после обработки всех слов на текущем уровне
        }

        return 0;
    }
}
