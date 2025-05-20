package org.example.algo.yandex.insert_delete_getRandom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

//380. Insert Delete GetRandom O(1)
public class RandomizedSet {

    //ArrayList get/delete - O(1) - by index add - O(1)/O(n)
    //HasMap  (key-index; value-val) - get/delete/put O(1) to O(lgn)/O(n)

    //key-val; value-index
    private HashMap<Integer, Integer> valIndexMap;
    private List<Integer> values;
    private Random random;

    public RandomizedSet() {
        valIndexMap = new HashMap<>();
        values = new ArrayList<>();
        random = new Random();
    }

    public boolean insert(int val) {
        if (valIndexMap.containsKey(val)) {
            return false;
        }

        valIndexMap.put(val, values.size());
        values.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (!valIndexMap.containsKey(val)) {
            return false;
        }

        int indexToRemove = valIndexMap.get(val);
        int lastElement = values.get(values.size() - 1);

        // Move the last element to the index of the element to remove
        values.set(indexToRemove, lastElement);
        valIndexMap.put(lastElement, indexToRemove);

        // Remove the last element
        values.remove(values.size() - 1);
        valIndexMap.remove(val);

        return true;
    }

    public int getRandom() {
        int randomIndex = random.nextInt(values.size());
        return values.get(randomIndex);
    }
}
/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
