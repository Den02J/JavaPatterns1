package BehavioralPatterns.Iterator;

public class IteratorRunner {
    public static void main(String[] args) {
        String[] accounts = {"PersonalAccount", "SalaryAccount", "SavingsAccount"};
        RwSBank bank = new RwSBank(accounts);

        Iterator iterator = bank.getIterator();
        System.out.println("Accounts:");

        while(iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }
}
