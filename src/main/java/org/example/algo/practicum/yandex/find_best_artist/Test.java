package org.example.algo.practicum.yandex.find_best_artist;

import java.util.List;

public class Test {

    public static void main(String[] args) {
        Competition competition = new Competition(5);

        competition.dislike(0);
        competition.dislike(3);
        competition.dislike(1);
        competition.like(0);
        competition.like(0);
        competition.like(1);
        competition.like(0);
        competition.like(3);
        competition.like(3);
        competition.like(3);


        List<Integer> bestWorks = competition.getBestWorks(3);
        System.out.println(bestWorks);
    }
}
