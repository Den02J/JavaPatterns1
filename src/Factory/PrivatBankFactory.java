package Factory;

import AbstractFactory.Bank;

public class PrivatBankFactory implements BankFactory{
    @Override
    public Bank createBank() {
        return new PrivatBank();
    }
}
