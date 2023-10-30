package week8.day5af;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Student implements Serializable {
   private String address;
   private List<String>  courses,  hobbies;

    public Student(String address) {
        this.address = address;
        this.courses = new ArrayList<>();
        this.hobbies = new ArrayList<>();
    }

    public String getAddress() {
        return address;
    }

    public List<String> getCourses() {
        return courses;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    @Override
    public String toString() {
        return "Students{" +
                "address=" + address +
                ", courses=" + courses +
                ", hobbies=" + hobbies +
                '}';
    }
}
