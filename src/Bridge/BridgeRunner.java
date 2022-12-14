package Bridge;

public class BridgeRunner {
    public static void main(String[] args) {
        Payment [] payments = {
                new Bank1(new Client2()),
                new Bank2(new Client1())
        };

        for(Payment payment: payments){
            payment.paymentProcess();
        }

    }
}
