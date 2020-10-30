package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<String> list = new ArrayList<>(Arrays.asList(
                "one", "two", "three", "four", "five", "six"));
        System.out.println(String.join("; ", list));


    }
}
