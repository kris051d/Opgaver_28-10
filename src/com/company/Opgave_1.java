package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Opgave_1 {


    public static double gennemsnit(int [] helTal, int antal){
        int sum = 0;

        for (int i = 0; i < antal; i++)
            sum += helTal[i];

        return sum/antal;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] helTal = new int[10];

        System.out.println("Indtast 10 tal");

        for (int i = 0; i < 10; i++) {
            helTal[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(helTal));

        System.out.println("Der er " + helTal.length + " tal i arrayet.");

        System.out.println(gennemsnit(helTal, 10));
/*
        // gemmer gennemsnittet, så den kan bruges til videre udregning.
        double g;
        g = gennemsnit(helTal, 10);
        System.out.println(g);
 */

    }
}