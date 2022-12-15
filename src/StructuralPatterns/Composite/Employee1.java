package StructuralPatterns.Composite;

public class Employee1 implements Employee{
    @Override
    public void carryOutTransaction() {
        System.out.println("Employee carry out transaction");
    }
}
