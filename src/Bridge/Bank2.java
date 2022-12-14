package Bridge;

public class Bank2 extends Payment {
    protected Bank2(ClientInBank client){
        super(client);
    }

    @Override
    public void paymentProcess() {
        System.out.println("Payment in Bank 2");
        client.paymentProcess();
    }
}
