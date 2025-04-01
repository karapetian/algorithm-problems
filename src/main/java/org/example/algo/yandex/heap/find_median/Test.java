package org.example.algo.yandex.heap.find_median;

public class Test {

    public static void main(String[] args) {
        MedianFinder test = new MedianFinder();
        test.addNum(4);
        test.addNum(7);
        test.addNum(3);
        test.addNum(1);
        test.addNum(5);
        test.addNum(0);
        double result = test.findMedian();

        System.out.println(result);
    }
}
