package StructuralPatterns.Composite;


import java.util.ArrayList;
import java.util.List;

public class BankSystem {
    private List<Employee> employees = new ArrayList<Employee>();

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public void removeEmployee(Employee employee){
        employees.remove(employee);
    }

    public void startWork(){
        System.out.println("Work started");
        for(Employee employee: employees){
            employee.carryOutTransaction();
        }
    }
}
