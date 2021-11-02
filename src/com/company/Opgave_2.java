package com.company;

import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Opgave_2 {

    public static void main(String[] args) {
        int[] helTal = new int[10];
        try{
           File myObj = new File("MinFil1.txt");
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

        try {
            File myObj1 = new File("MinFil2.txt");

            if(myObj1.createNewFile()) {
                System.out.println("File Created" + myObj1.getName());
            }else{
                System.out.println("File already exists");
            }

            FileWriter writer = new FileWriter("MinFil2.txt");

            for (int j: helTal) {
                writer.write(j + 10 + "\n");
            }
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


