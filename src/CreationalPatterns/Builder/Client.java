package CreationalPatterns.Builder;

public class Client {
    private String firstName;
    private String lastName;
    private String bank;
    private int balance;

    private Client(Builder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.bank = builder.bank;
        this.balance = builder.balance;
    }

    @Override
    public String toString() {
        return "Client{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", bank='" + bank + '\'' +
                ", balance=" + balance +
                '}';
    }

    static class Builder{
        private String firstName;
        private String lastName;
        private String bank;
        private int balance;

        public Builder(){
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setBank(String bank) {
            this.bank = bank;
            return this;
        }

        public Builder setBalance(int balance) {
            this.balance = balance;
            return this;
        }

        public Client build() {
            return new Client(this);
        }
    }
}
