import java.util.Scanner;

public class WithdrawalSystem {

    static class InsufficientBalanceException extends Exception {
        double balance;
        double withdrawalAmount;

        public InsufficientBalanceException(double balance, double withdrawalAmount) {
            this.balance = balance;
            this.withdrawalAmount = withdrawalAmount;
        }

        @Override
        public String getMessage() {
            return "Insufficient Balance\n" +
                   "Balance Amount: " + balance +
                   "\nWithdrawal Amount: " + withdrawalAmount;
        }
    }

   
    static class Atm {
        private double balance = 10000;

        public void withdraw(double amount) throws InsufficientBalanceException {
            if (amount > balance) {
                throw new InsufficientBalanceException(balance, amount);
            }

            balance -= amount;
            System.out.println("Balance after withdrawal of amount "
                    + amount + " is " + balance);
        }
    }

    public static void main(String[] args) {
        Atm atm = new Atm();

        try {
            atm.withdraw(5000);
            // atm.withdraw(15000); 
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}