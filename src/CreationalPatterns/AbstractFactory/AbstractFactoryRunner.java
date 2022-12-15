package CreationalPatterns.AbstractFactory;

public class AbstractFactoryRunner {
    public static void main(String[] args) {
        Factory bankFactory = new AbstractFactory().createFactory("bank");
        Factory accountFactory = new AbstractFactory().createFactory("account");

        Bank privatBank = bankFactory.createBank("privat");
        Bank monoBank = bankFactory.createBank("mono");
        privatBank.show();
        monoBank.show();

        Account salaryAccount = accountFactory.createAccount("salaryAccount");
        Account savingsAccount = accountFactory.createAccount("savingsAccount");
        salaryAccount.show();
        savingsAccount.show();

    }
}
