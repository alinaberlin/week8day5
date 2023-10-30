package org.example;

import java.io.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try (FileOutputStream fileOutputStream = new FileOutputStream("person.out");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            Person person = new Person(23, "Alina");
            objectOutputStream.writeObject(person);
            objectOutputStream.flush();
            System.out.println(person);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try(FileInputStream fileInputStream = new FileInputStream("person.out");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)){
            Person person = (Person) objectInputStream.readObject();

        } catch(Exception e) {
            e.printStackTrace();
        }

    }

}