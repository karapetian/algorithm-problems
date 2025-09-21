package org.example.algo.yandex.array.three_sum;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//15. 3Sum
//Adobe
public class Solution {

    //[-1,0,1,2,-1,-4]
    //[-4, -1, -1, 0, 1, 2]
    //Time: O(n^2) + O(ngln) - Sorting + Two Pointers (Optimal & Classic) approach
    //Space: O(1)
    public static List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3) {
            return List.of();
        }
        Set<List<Integer>> result = new HashSet<>(); //set works only with sorted lists. If the elements pf list are not sorted, they wont be considered as equal
        Arrays.sort(nums); //ngln

        for (int i = 0; i < nums.length; i++) { //i=1      //---- n^2
            int subSum = 0 - nums[i]; //-1

            int leftIdx = i + 1; //2
            int rigthindx = nums.length - 1; //3

            while (leftIdx < rigthindx) {
                int currentSum = nums[leftIdx] + nums[rigthindx]; //-1
                if (currentSum == subSum) {
                    result.add(List.of(nums[i], nums[leftIdx], nums[rigthindx]));
                    rigthindx--;
                    leftIdx++;
                } else if (currentSum > subSum) {
                    rigthindx--;
                } else {
                    leftIdx++;
                }
            }
        }
        return new ArrayList<>(result);
    }

    public static void main(String[] args) {
//        int [] input = {0, 0, 0};
        int[] input = {-1, 0, 1, -1};
//        System.out.println(threeSum(input));
        System.out.println(threeSum(input));

        List<Integer> list = List.of(1,2,3);
        List<Integer> list2 = List.of(1,2,3);
        System.out.println(list.equals(list2));
    }
}
