package CreationalPatterns.AbstractFactory;

public class AbstractFactory {
    Factory createFactory(String typeOfFactory) {
        if (typeOfFactory.equalsIgnoreCase("bank")){
            return new BankFactory();
        }
        else if(typeOfFactory.equalsIgnoreCase("account")){
            return new AccountFactory();
        }
        else {
            throw new RuntimeException(typeOfFactory + " not found");
        }
    }
}
