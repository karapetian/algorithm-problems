package org.example.algo.valid_parentheses;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static boolean isValid(String input) {
        int size = input.length();

        Set<Character> startingPars = new HashSet<>();
        startingPars.add('(');
        startingPars.add('[');
        startingPars.add('{');

        Set<Character> endingPars = new HashSet<>();
        endingPars.add(')');
        endingPars.add(']');
        endingPars.add('}');

        char[] inputCharArray = input.toCharArray();
        if (startingPars.contains(inputCharArray[size - 1])) {
            return false;
        }
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = size - 1; i >= 0; i--) {
            if (endingPars.contains(inputCharArray[i])) {
                stack.addFirst(inputCharArray[i]);
            } else {
                Character startingPar = inputCharArray[i];
                Character head = stack.peek();
                if (head==null) {
                    return false;
                } else if (isAMatch(startingPar, head)) {
                    stack.poll();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static boolean isAMatch(Character startingPar, Character endingPar) {
        return (startingPar.equals('(') && endingPar.equals(')')) ||
                (startingPar.equals('[') && endingPar.equals(']')) ||
                (startingPar.equals('{') && endingPar.equals('}'));
    }
}
