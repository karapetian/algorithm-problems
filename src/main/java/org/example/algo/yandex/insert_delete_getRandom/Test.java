package org.example.algo.yandex.insert_delete_getRandom;


public class Test {

    public static void main(String[] args) {
        RandomizedSet test = new RandomizedSet();

        test.insert(2);
        test.insert(22);
        test.insert(222);

        test.remove(22);

        System.out.println(test.getRandom());


    }
}
