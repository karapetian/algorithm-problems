package org.example.algo.align.overlapping_circles;

//given center position and radius, how to detect two circles are overlapping
public class Solution {

    static boolean circlesOverlap(double x1, double y1, double r1,
                                  double x2, double y2, double r2) {


        //find distance between 2 centers
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distance <= r2 + r1;
    }

    public static void main(String[] args) {
        System.out.println(circlesOverlap(0,0, 3, 4, 0, 3));
        System.out.println(circlesOverlap(0,0, 2, 5, 0, 2));
        System.out.println(circlesOverlap(0,0, 5, 0, 0, 3));
    }
}
