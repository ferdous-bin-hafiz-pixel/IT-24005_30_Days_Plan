class BankAccount {
    private double balance;

       public void setBalance(double balance) {
        if(balance > 0) {
            this.balance = balance;
        }
    }

       public double getBalance() {
        return balance;
    }
}

public class TestAccount {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        acc.setBalance(1000);
        System.out.println("Balance: " + acc.getBalance());
    }
}