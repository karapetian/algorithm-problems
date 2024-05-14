package org.example.algo.practicum.yandex.fibonachi;

//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, …
public class Test {

    public static void main(String[] args) {
        int n = 5;
        System.out.println("---" + n + "---");
        System.out.println(Solution.findFibonachi(n));
//        System.out.println(Solution.findFibonachi_Rec(n));
    }
}
