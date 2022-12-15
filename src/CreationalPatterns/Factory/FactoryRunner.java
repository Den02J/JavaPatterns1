package CreationalPatterns.Factory;

import CreationalPatterns.AbstractFactory.Bank;

public class FactoryRunner {
    public static void main(String[] args) {
        BankFactory bankFactory = createBankByName("privat");
        Bank bank = bankFactory.createBank();

        bank.show();

    }

    static BankFactory createBankByName(String name){
        if(name.equalsIgnoreCase("privat")){
            return new PrivatBankFactory();
        }
        else if(name.equalsIgnoreCase("mono")){
            return new MonoBankFactory();
        }
        else{
            throw new RuntimeException(name + " not found");
        }
    }
}
