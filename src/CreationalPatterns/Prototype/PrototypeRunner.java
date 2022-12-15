package CreationalPatterns.Prototype;

public class PrototypeRunner {
    public static void main(String[] args) throws CloneNotSupportedException {

        BankClientPrototype client1 = new BankClientPrototype("Gary", "Vert", 1000);
        BankClientPrototype client2 = (BankClientPrototype) client1.clone();
        System.out.println(client1);
        System.out.println(client2);

        BankClientPrototype client3 = client2.copy();
        System.out.println(client3);

    }
}
