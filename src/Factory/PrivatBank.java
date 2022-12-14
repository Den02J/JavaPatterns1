package Factory;

import AbstractFactory.Bank;

public class PrivatBank implements Bank {

    @Override
    public void show() {
        System.out.println("This is PrivatBank");
    }
}
