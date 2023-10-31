package week9_miniproject;

import java.security.Key;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EmployeeDAO {
    HashMap<Integer, Employeee> employees = new HashMap<>();
    public static HashSet<Employeee>  storeEmployee(){
        HashSet<Employeee> storeEmployee = new HashSet();
        Employeee employeee1= new Employeee("Alina", "QA", "QA Analist", 1, -1);
        Employeee employeee2= new Employeee("Alina2", "QAA", "QA Engineer", 2, 1);
        storeEmployee.add(employeee1);
        storeEmployee.add(employeee2);

        return storeEmployee;
    }
    public boolean insert(Employeee employeee){
        if(employees.containsKey(employeee.getId())){
            return false;
        }
        employees.put(employeee.getId(), employeee);
        return true;
    }
    public boolean delete(Integer id){
        if (employees.containsKey(id)){
            employees.remove(id);
            return true;
        }
        return false;
    }
    public boolean update(Employeee employeee){
        if(employees.containsKey(employeee.getId()))
        {
            employees.replace(employeee.getId(), employeee);
            return true;
        }return false;
    }
    public Employeee find(Integer id){
       return employees.get(id);
    }
    public List<Employeee> filterByDepartment(String department){
     return employees.values().stream().filter(e ->e.getDepartament().equalsIgnoreCase(department) ).toList();

    }

}
