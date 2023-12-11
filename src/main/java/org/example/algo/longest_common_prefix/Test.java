package org.example.algo.longest_common_prefix;


public class Test {
    public static void main(String[] args) {

//        String [] testArray = {"flower","flow","flight"};
//        String [] testArray = {"dog","racecar","car"};
//        String [] testArray = {"dog"};
//        String [] testArray = {"", ""};
//        String [] testArray = {"cba",""};
//        String [] testArray = {"baab","bacb","b","cbc"}; //
        String [] testArray = {"cir","car"};
//        String result = Solution.longestCommonPrefix(testArray);
        String result = Solution2.longestCommonPrefix(testArray);
        System.out.println(result);

//        System.out.println("flower".indexOf("flow"));
    }
}
