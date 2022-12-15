package BehavioralPatterns.Iterator;

import java.util.Arrays;

public class RwSBank implements Collection{
    private String [] accounts;

    public RwSBank(String[] accounts) {
        this.accounts = accounts;
    }

    public String[] getAccounts() {
        return accounts;
    }

    public void setAccounts(String[] accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return "RwSBank{" +
                "accounts=" + Arrays.toString(accounts) +
                '}';
    }

    @Override
    public Iterator getIterator() {
        return new AccountsIterator();
    }

    private class AccountsIterator implements Iterator{
        int index;

        @Override
        public boolean hasNext() {
            if(index < accounts.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return accounts[index++];
        }
    }
}
