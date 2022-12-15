package StructuralPatterns.Bridge;

public class Client1 implements ClientInBank{
    @Override
    public void paymentProcess() {
        System.out.println("Client 1 is paying...");
    }
}
