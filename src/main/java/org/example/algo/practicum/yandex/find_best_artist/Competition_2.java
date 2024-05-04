package org.example.algo.practicum.yandex.find_best_artist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Competition_2 {

    private List<Integer> scores;
    private TreeSet<Pair> orderedWorks;

    private void changeScore(int participantId, int change) {
        orderedWorks.remove(new Pair(scores.get(participantId), participantId));
        scores.set(participantId, scores.get(participantId) + change);
        orderedWorks.add(new Pair(scores.get(participantId), participantId));
    }

    public Competition_2(int participantCount) {
        scores = new ArrayList<>(participantCount);
        for (int i = 0; i < participantCount; ++i) {
            scores.add(0);
        }
        orderedWorks = new TreeSet<>(Comparator.reverseOrder());
        for (int i = 0; i < participantCount; ++i) {
            orderedWorks.add(new Pair(0, i));
        }
    }

    public void like(int participantId) {
        changeScore(participantId, 1);
    }

    public void dislike(int participantId) {
        changeScore(participantId, -1);
    }

    public List<Integer> getBestWorks(int K) {
        List<Integer> result = new ArrayList<>();
        for (Pair pair : orderedWorks) {
            if (result.size() >= K) {
                break;
            }
            result.add(pair.second);
        }
        return result;
    }

    private static class Pair implements Comparable<Pair> {
        int first;
        int second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public int compareTo(Pair other) {
            return Integer.compare(this.first, other.first);
        }
    }
}
