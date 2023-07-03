package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] sArray = {"мама", "папа", "їж їжак желе"};
        String s = "";
        for (String n:sArray)
            s+= n;
        char[] charArr = s.toCharArray();

        HashMap<Character, Integer> hashmap = new HashMap<>();

        for (char ch : charArr) {
            int count = hashmap.getOrDefault(ch, 0);

            hashmap.put(ch, count + 1);
        }

        for(Map.Entry<Character, Integer> pair : hashmap.entrySet()){
            if(pair.getValue() % 2 ==0)
                System.out.println(pair.getKey());
        }

        for (int b = 0; b < charArr.length; b++) {
            hashmap.put(charArr[b], b);
        }

        System.out.println(hashmap.keySet());

    }

}



