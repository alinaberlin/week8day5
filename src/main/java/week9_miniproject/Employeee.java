package week9_miniproject;

import java.util.Objects;

public class Employeee {
    private String name,  departament, jobTitle;
    private int id, managerId;

    public Employeee(String name, String departament, String jobTitle, int id, int managerId) {
        this.name = name;
        this.departament = departament;
        this.jobTitle = jobTitle;
        this.id = id;
        this.managerId = managerId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartament() {
        return departament;
    }

    @Override
    public String toString() {
        return "Employeee{" +
                "name='" + name + '\'' +
                ", departament='" + departament + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", id=" + id +
                ", managerId=" + managerId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employeee employeee = (Employeee) o;
        return getId() == employeee.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
