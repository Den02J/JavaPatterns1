package Factory;

import AbstractFactory.Bank;

public class MonoBank implements Bank {

    @Override
    public void show() {
        System.out.println("This is MonoBank");
    }
}
