package com.company;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class SkrivTilFil {

    public static void main(String[] args) {
        try {
            int x;
            float y;
            String s;

            Scanner in = new Scanner(System.in);

           // in.useLocale(Locale.US);

            x = in.nextInt();

            y = in.nextFloat();

            s = in.next();

            PrintWriter fil = new PrintWriter("test.txt");

            fil.println(x);
            fil.println(s);
            fil.println(y);
            fil.format("%d %s %f\n", x, s, y);

            fil.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
