package Adapter;

public class AdapterRunner {
    public static void main(String[] args) {
        BankClient1 client1 = new AdapterBankClient2ToBankClient1();
        client1.name();
        client1.bank();
        client1.balance();
    }
}
