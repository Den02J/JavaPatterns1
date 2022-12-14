package AbstractFactory;

import Factory.MonoBank;
import Factory.PrivatBank;

public class BankFactory implements Factory{
    public Bank createBank(String name){
        if (name.equalsIgnoreCase("privat")){
            return new PrivatBank();
        }
        else if(name.equalsIgnoreCase("mono")){
            return new MonoBank();
        }
        else {
            throw new RuntimeException(name + " not found");
        }
    }

    @Override
    public Account createAccount(String typeOfAccount) {
        return null;
    }
}
