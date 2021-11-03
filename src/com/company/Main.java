package com.company;


import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
/*
        Opgave_3 opgave3 = new Opgave_3();
        opgave3.makeFile();
        opgave3.readFile();
*/
        Opgave_4 opgave4 = new Opgave_4();
        opgave4.lavArrays();

        Person[] person = new Person[3];

        for (int i = 0; i < person.length; i++) {
            person[i] = new Person(opgave4.intArray[i],opgave4.stringArray[i],opgave4.floatArray[i]);
        }

        printAlleperoner(person);

        writeToFile(person);

        IndFraFil();
    }

    public static void writeToFile(Person[] person) throws IOException {

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("personer.ser"));

        for (Person pers : person) {
            objectOutputStream.writeObject(pers);
        }
        objectOutputStream.close();
    }


    public static void printAlleperoner(Person[] personer) {

        for(Person pers : personer){
            System.out.println(pers.toString());
        }

    }

    public static void IndFraFil() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("personer.ser"));

        Person[] person = new Person[3];


        for (int i = 0; i < person.length; i++) {
            person[i] = (Person) objectInputStream.readObject();
        }

        for (Person pers : person) {
            System.out.println("From read file");
            System.out.println(pers.toString());
        }
    }
}

