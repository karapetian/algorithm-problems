package org.example.algo.valid_parentheses;

import static org.example.algo.valid_parentheses.Solution.isValid;

public class Test {
    public static void main(String[] args) {

//        String test = "()[]{}"; //true
//        String test = "([)]"; //false
//        String test = "(]{}"; //false
//        String test = "({[)"; //false
//        String test = "({})"; //true
        String test = "([]"; //false
        System.out.println(isValid(test));

    }
}
