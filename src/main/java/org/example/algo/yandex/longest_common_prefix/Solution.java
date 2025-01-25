package org.example.algo.yandex.longest_common_prefix;

//14. Longest Common Prefix in string array
//Trie data structure: https://www.geeksforgeeks.org/trie-insert-and-search/
public class Solution {

    public String longestCommonPrefix(String[] strs) {
        Node root = new Node();
        //insert all chars of all strings into trie
        for (int i = 0; i < strs.length; i++) {
            String current = strs[i];
            //insert current string's chars into trie
            // O(n) complexity for each string, so O(nn) for all strings in array

        }

        //search for longest common prefix in trie till the number of not null children is strs.length
        //O(n) complexity

        //Overall O(n2) + O(n) complexity - not good approach
        return "";
    }

    static class Node {
        private Node[] children = new Node[26];
        private boolean isEnd;

        boolean getIsEnd() {
            return isEnd;
        }

        void addChild(Node child, int index) {
            if (children[index] != null) {
                children[index] = child;
            }
        }
    }
}
