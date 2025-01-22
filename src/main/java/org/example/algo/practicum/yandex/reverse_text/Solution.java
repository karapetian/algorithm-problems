package org.example.algo.practicum.yandex.reverse_text;

//Дана строка из слов, разделённых пробелом. Нужно поменять порядок слов в строке на противоположный.
public class Solution {

    static String reverseText(String text) {
        String[] splitArray = text.split(" ");

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = splitArray.length - 1; i >= 0; i--) {
            stringBuilder.append(splitArray[i]);
            if (i != 0) {
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseText("При этом не стоит совсем отказываться от такого решения"));
    }
}
