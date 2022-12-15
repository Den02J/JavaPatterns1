package BehavioralPatterns.Strategy;

import BehavioralPatterns.State.*;

public class StrategyRunner {
    public static void main(String[] args) {
        BankCustomer bankCustomer = new BankCustomer(new CheckingBalance());
        bankCustomer.doIt();

        bankCustomer.setActivity(new AddingMoney());
        bankCustomer.doIt();

        bankCustomer.setActivity(new ChoosingRecipient());
        bankCustomer.doIt();

        bankCustomer.setActivity(new TransferringMoney());
        bankCustomer.doIt();
    }
}
