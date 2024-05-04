package org.example.algo.practicum.yandex.find_best_artist;

//мы проводим онлайн-конкурс работ молодых художников. Всего представлено
//N работ, которые идентифицируются числами от 0 до N-1 включительно. Нужно поддержать 3 типа запроса:
//        Лайк работы с идентификатором id.
//        Дизлайк работы с идентификатором id.
//        Вернуть лучшие K работ. Оценку работы будем считать просто: число лайков минус число дизлайков.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Competition {
    private List<Integer> scores;

    private void changeScore(int participantId, int change) {
        scores.set(participantId, scores.get(participantId) + change);
    }

    public Competition(int participantCount) {
        scores = new ArrayList<>(Collections.nCopies(participantCount, 0));
    }

    public void like(int participantId) {
        changeScore(participantId, 1);
    }

    public void dislike(int participantId) {
        changeScore(participantId, -1);
    }

    public List<Integer> getBestWorks(int K) {
        List<Pair> scoresIds = new ArrayList<>();
        for (int i = 0; i < scores.size(); ++i) {
            scoresIds.add(new Pair(scores.get(i), i));
        }
        Collections.sort(scoresIds, Comparator.reverseOrder());

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < Math.min(K, scoresIds.size()); ++i) {
            result.add(scoresIds.get(i).second);
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
