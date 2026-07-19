public class BankSystem {
    public static void main(String[] args) {

        SavingsAccount savings = new SavingsAccount();
        savings.setAccountNumber("S101");
        savings.setAccountHolderName("Alice");
        savings.setBalance(10000);
        savings.setInterestRate(5);

        savings.deposit(2000);
        savings.withdraw(1000);

        CurrentAccount current = new CurrentAccount();
        current.setAccountNumber("C202");
        current.setAccountHolderName("Bob");
        current.setBalance(20000);
        current.setMonthlyBonusRate(3);

        current.deposit(5000);
        current.withdraw(3000);

        System.out.println("Savings Account Details:");
        savings.displayAccountInfo();
        System.out.println("Interest: " + savings.calculateInterest());

        System.out.println();

        System.out.println("Current Account Details:");
        current.displayAccountInfo();
        System.out.println("Interest: " + current.calculateInterest());
    }
}