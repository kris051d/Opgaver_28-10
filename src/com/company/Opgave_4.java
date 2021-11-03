package com.company;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Opgave_4 {

    public int[] intArray = new int[3];
    public String[] stringArray = new String[3];
    public float[] floatArray = new float[3];

    public void lavArrays() {


        try {
            File myFile = new File("persondata.txt");

            Scanner scanner = new Scanner(myFile);

            for (int i = 0; i < intArray.length; i++) {
                intArray[i] = scanner.nextInt();
                stringArray[i] = scanner.next();
                floatArray[i] = scanner.nextFloat();
            }


            System.out.println(Arrays.toString(intArray) + " " + intArray.length);
            System.out.println(Arrays.toString(stringArray) + " " + stringArray.length);
            System.out.println(Arrays.toString(floatArray) + " " + floatArray.length);


            gemTilDat(intArray, stringArray, floatArray);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void gemTilDat (int[] intArray, String[] stringArray, float[] floatArray) throws IOException {

        DataOutputStream output = new DataOutputStream(new FileOutputStream("Datafile.dat"));

        for (int j = 0; j < intArray.length; j++) {

            output.writeBytes((intArray[j]) + " " + stringArray[j] + " " + floatArray[j] + "\n");

        }

        output.close();


        DataInputStream input = new DataInputStream(new FileInputStream("Datafile.dat"));
        StringBuilder text = new StringBuilder();


        int value = input.read();

        while (value != -1) {
            System.out.print(Character.toString(value));

            text.append(Character.toString(value));

            value = input.read();
        }

        Scanner scanner = new Scanner(String.valueOf(text));

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = scanner.nextInt();
            stringArray[i] = scanner.next();
            floatArray[i] = Float.parseFloat(scanner.next());
        }

        System.out.println(Arrays.toString(intArray) + " " + intArray.length);
        System.out.println(Arrays.toString(stringArray) + " " + stringArray.length);
        System.out.println(Arrays.toString(floatArray) + " " + floatArray.length);

        input.close();
    }
}
