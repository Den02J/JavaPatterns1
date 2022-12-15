package CreationalPatterns.AbstractFactory;

public class SavingsAccount implements Account{
    @Override
    public void show() {
        System.out.println("This is Savings account");
    }
}
