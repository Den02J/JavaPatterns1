package StructuralPatterns.Bridge;

public class Client2 implements ClientInBank{
    @Override
    public void paymentProcess() {
        System.out.println("Client 2 is paying...");
    }
}
