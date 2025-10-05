package org.example.algo.adobe.array_intersection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Return thr intersection of 2 string arrays. The result should contain unique strings in the order of the 1st array
public class Solution {

    static String[] getIntersection(String[] s1, String[] s2) {
        List<String> resultList = new ArrayList<>();

        Set<String> set2 = new HashSet<>();
        for (String s : s2) {
            set2.add(s);
        }

        for (String s : s1) {
            if(set2.contains(s)){
                resultList.add(s);
                set2.remove(s);
            }
        }

        return resultList.toArray(new String[0]);
    }

    public static void main(String[] args) {
//        String[] s1 = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9"};
//        String[] s2 = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9"};

        String[] s1 = new String[]{"6", "1", "7", "2", "9", "1"};
        String[] s2 = new String[]{"1", "2", "3", "4", "5", "6", "2", "7", "8", "9"};

        System.out.println(Arrays.toString(getIntersection(s1, s2)));
    }
}
