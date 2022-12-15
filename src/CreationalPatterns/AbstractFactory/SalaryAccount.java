package CreationalPatterns.AbstractFactory;

public class SalaryAccount implements Account{
    @Override
    public void show() {
        System.out.println("This is Salary account");
    }
}
