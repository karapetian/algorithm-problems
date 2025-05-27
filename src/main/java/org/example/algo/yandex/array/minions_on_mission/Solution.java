package org.example.algo.yandex.array.minions_on_mission;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Miro
//You get a List of initial positions(can be negative numbers as well) (I found out that the list is sorted)
//A person on each position can go right or left.
//Also you get a command, like "RLR", that is the moving command for the people
//(I found out that the length of the command is equal to the number of people)
//When there is a collision, i.e 2 people get on the same position, move them to the opposite direction.
//(So in case of collision you move them back to their original locations)
//Run the 'command' 'round' time on 'positions'.
//Return the latest positions of the people.
public class Solution {

    // {2, 6, 8} - {3, 5, 7} - {4, 4, 6}
    static List<Integer> getLatestPosition2(List<Integer> positions, String command, int round) {
        //find the size array of the array on which we are going to operate
        int startPos = positions.getFirst() - round;
        int endPos = positions.getLast() + round;
        int arraySize = endPos - startPos + 1;

        //fill the data into array
        int[] posArray = new int[arraySize];
        for (int i = 0; i < positions.size(); i++) {
            posArray[positions.get(i)] = i + 1;
        }

        char[] commandCharArray = command.toCharArray();
        while (round > 0) {
            for (int i = 0; i < commandCharArray.length; i++) {
                int indx = positions.get(i);
                if (commandCharArray[i] == 'L') {
                    swap(posArray, indx, indx-1);
                } else {
                    swap(posArray, indx, indx+1);
                }
            }
            round--;
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arraySize; i++) {
            if (posArray[i] != 0) {
                result.add(i);
            }
        }
        return result;
    }

    private static void swap(int[] commandCharArray, int i, int i1) {
        int tmp = commandCharArray[i];
        commandCharArray[i] = commandCharArray[i1];
        commandCharArray[i1] = tmp;
    }
    // {2, 6, 8} - {3, 5, 7} - {4, 4, 6}
    public static List<Integer> getLatestPosition(List<Integer> positions, String command, int round) {
        int posCount = positions.size();
        List<Integer> currentPositions = new ArrayList<>(positions);
        char[] directions = command.toCharArray();

        while (round-- > 0) {
            Map<Integer, List<Integer>> moveMap = new HashMap<>();

            // Step 1: Prepare new tentative positions
            for (int i = 0; i < posCount; i++) {
                int newPos = directions[i] == 'L' ? currentPositions.get(i) - 1 : currentPositions.get(i) + 1;
                moveMap.computeIfAbsent(newPos, k -> new ArrayList<>()).add(i);
            }

            // Step 2: Apply movements or handle collision
            for (Map.Entry<Integer, List<Integer>> entry : moveMap.entrySet()) {
                List<Integer> movingPeople = entry.getValue();
                if (movingPeople.size() == 1) {
                    int personIndex = movingPeople.get(0);
                    currentPositions.set(personIndex, entry.getKey()); // move to new pos
                }
                // else: collision — do nothing, they stay in place
            }
        }

        // Final positions
        Collections.sort(currentPositions);
        return currentPositions;
    }

    public static void main(String[] args) {
       List<Integer> input = List.of(2, 6, 8);
        String command = "RLL";
        int round  = 2;
        System.out.println(getLatestPosition(input, command, round));
    }
}
