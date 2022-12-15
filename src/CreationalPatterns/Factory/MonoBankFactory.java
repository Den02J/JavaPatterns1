package CreationalPatterns.Factory;

import CreationalPatterns.AbstractFactory.Bank;

public class MonoBankFactory implements BankFactory{
    @Override
    public Bank createBank() {
        return new MonoBank();
    }
}
