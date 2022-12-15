package StructuralPatterns.Bridge;

public class Bank1 extends Payment{
    protected Bank1(ClientInBank client){
        super(client);
    }

    @Override
    public void paymentProcess() {
        System.out.println("Payment in Bank 1");
        client.paymentProcess();
    }
}
