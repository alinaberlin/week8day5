package week8.day5af;

import java.io.*;
import java.util.Arrays;

public class Util {
    public static void prefilStudents () {
        try (FileOutputStream fileOutputStream = new FileOutputStream("student.out");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            Student student1 = new Student("any address");
            Student student2 = new Student("any address2");
            student2.getCourses().addAll(Arrays.asList("English", "Geo", "Math"));
            student2.getHobbies().addAll(Arrays.asList("Hiking", "Coding", "Sport"));
            student1.getCourses().addAll(Arrays.asList("English", "Geo", "Math"));
            student1.getHobbies().addAll(Arrays.asList("Hiking", "Coding", "Sport"));
            objectOutputStream.writeObject(student1);
            objectOutputStream.writeObject(student2);
            objectOutputStream.flush();
            System.out.println("Serilization complet");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (FileInputStream fileInputStream = new FileInputStream("student.out");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            try {
                while (true) {
                    Student student = (Student
                            ) objectInputStream.readObject();
                    System.out.println(student);
                }
            } catch (EOFException e) {

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
