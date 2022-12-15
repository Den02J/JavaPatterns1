package CreationalPatterns.AbstractFactory;

public class AccountFactory implements Factory{
    public Account createAccount(String typeOfAccount){
        if (typeOfAccount.equalsIgnoreCase("salaryAccount")){
            return new SalaryAccount();
        }
        else if(typeOfAccount.equalsIgnoreCase("savingsAccount")){
            return new SavingsAccount();
        }
        else {
            throw new RuntimeException(typeOfAccount + " not found");
        }
    }

    @Override
    public Bank createBank(String name) {
        return null;
    }
}
