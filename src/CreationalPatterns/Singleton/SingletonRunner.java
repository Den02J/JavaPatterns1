package CreationalPatterns.Singleton;

public class SingletonRunner {

    public static void main(String[] args) {
        BankClient client1 = BankClient.getInstance();
        BankClient client2 = BankClient.getInstance();
        System.out.println(client1.toString() + "\n" + client2.toString());

        client2.increaseBalance();
        client2.showBalance();

        client1.increaseBalance();
        client1.showBalance();

        BankClient client3 = BankClient.getInstance();
        client3.increaseBalance();
        client3.showBalance();
    }
}
