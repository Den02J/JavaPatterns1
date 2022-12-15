package CreationalPatterns.Prototype;

public class BankClientPrototype implements Cloneable{
    private String firstName;
    private String lastName;
    private int balance;

    public BankClientPrototype(String firstName, String lastName, int balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        BankClientPrototype clone = new BankClientPrototype(firstName, lastName, balance);
        return super.clone();
    }

    public BankClientPrototype copy() {
        return new BankClientPrototype(firstName, lastName, balance);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankClient{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
