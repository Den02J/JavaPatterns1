package CreationalPatterns.Singleton;

public class BankClient{
    private static BankClient instance;
    private BankClient() {}
    public static synchronized BankClient getInstance(){
        if (instance == null) {
            instance = new BankClient();
        }
        return instance;
    }

    private static int balance;

    public void increaseBalance(){
        balance++;
    }

    public void showBalance(){
        System.out.println(balance);
    }


}