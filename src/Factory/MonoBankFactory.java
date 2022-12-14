package Factory;

import AbstractFactory.Bank;

public class MonoBankFactory implements BankFactory{
    @Override
    public Bank createBank() {
        return new MonoBank();
    }
}
