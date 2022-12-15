package BehavioralPatterns.State;

public class BankCustomer {
    Activity activity;

    public BankCustomer(Activity activity) {
        this.activity = activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity(){
        if (activity instanceof CheckingBalance){
            setActivity(new AddingMoney());
        }else if (activity instanceof AddingMoney){
            setActivity(new ChoosingRecipient());
        }else if (activity instanceof ChoosingRecipient){
            setActivity(new TransferringMoney());
        }else if (activity instanceof TransferringMoney){
            setActivity(new CheckingBalance());
        }
    }

    public void doIt(){
        activity.doIt();
    }
}
