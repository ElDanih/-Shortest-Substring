package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String in = "abcbbk";
        int out = 0;


        char[] chars = in.toCharArray();
        List<String> dictionary = new ArrayList<String>();

        for (char aChar : chars) {
            if (dictionary.contains(Character.toString(aChar))) {
                out++;
                continue;
            }
            dictionary.add(Character.toString(aChar));
        }

        System.out.println(out);

    }
}