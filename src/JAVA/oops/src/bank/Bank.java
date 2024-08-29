package bank;

public class Bank {
    public void showAccountDetails(Account account) {
        System.out.println(account.getAccountHolder());
        System.out.println("Account Number: " + account.accountNumber);
        System.out.println("Initial Balance: " + account.getBalance());
    }

    public void applyInterest(Account account) {
        account.calculateInterest();
        System.out.println("Interest applied. New Balance: " + account.getBalance());
    }

    public void performTransaction(Account account, String type, double amount) {
        switch (type) {
            case "Deposit":
                account.deposit(amount);
                break;
            case "Withdraw":
                account.withdraw(amount);
                break;
            default:
                System.out.println("Invalid transaction type");
        }
        System.out.println("Transaction complete. New Balance: " + account.getBalance());
    }

    public void generateStatement(Account account) {
        account.generateStatement();
    }
}
