package com.company;

import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.atomic.DoubleAccumulator;

public class Main {

    public static void main(String[] args) {
        long startEpochMs = new Date().getTime();

        long timeMs = new Date().getTime() - startEpochMs;
        System.out.println(timeMs);

        System.out.println(new Date());

    }
}
