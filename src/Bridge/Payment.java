package Bridge;

public abstract class Payment {
    protected ClientInBank client;

    protected Payment(ClientInBank client){
        this.client = client;
    }

    public abstract void paymentProcess();
}
