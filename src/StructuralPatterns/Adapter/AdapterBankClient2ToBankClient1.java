package StructuralPatterns.Adapter;

public class AdapterBankClient2ToBankClient1 extends  BankClient2 implements BankClient1{

    @Override
    public void name() {
        getName();
    }

    @Override
    public void balance() {
        checkBalance();
    }

    @Override
    public void bank() {
        showBank();
    }
}
