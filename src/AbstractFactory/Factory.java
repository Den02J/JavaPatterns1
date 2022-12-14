package AbstractFactory;

public interface Factory {
    Bank createBank(String name);
    Account createAccount(String typeOfAccount);

}
