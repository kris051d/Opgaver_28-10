package com.company;

import java.io.FileNotFoundException;
import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Opgave_2 {

    public static void main(String[] args) {
        int[] helTal = new int[10];
        try{
           File myObj = new File("filename.txt");
           Scanner in = new Scanner(myObj);

           int i = 0;
           while (in.hasNext()) {
               helTal[i] = in.nextInt();
               i++;
           }
           in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(Arrays.toString(helTal));
        System.out.println(Opgave_1.gennemsnit(helTal, 10));
    }
}


