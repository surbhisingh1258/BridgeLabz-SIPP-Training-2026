import java.util.Scanner;

public class BankUtility {
    BankCustomer bankCustomer;

    public void createAccount() {
        Scanner sc = new Scanner(System.in);
        int account_number = (int)(Math.random()*900000)/100000;
        System.out.println("ENTER YOUR ACCOUNT NAME: ");
        String name = sc.nextLine();

        double balance = 500000;
        bankCustomer = new BankCustomer(account_number, name, balance);
        System.out.println("Account Created!!");
        BankCustomer.Bank_TotalAccountNumber++;
    }

    public void deposit(double amount) {

        bankCustomer = new BankCustomer(2432432, "Sneha", 5000);
        BankCustomer.Bank_TotalAccountNumber++;

        if(amount < 0) {
            System.out.println("Invalid Amount!!!");
        } else {
            bankCustomer.Bank_AccountBalance += amount;
            System.out.println("Deposited Amount: " +amount);
            System.out.println("Current Balance is: " +bankCustomer.Bank_AccountBalance);
        }
    }
    
    public void withdraw(double amount) {
        if(amount > bankCustomer.Bank_AccountBalance) {
            System.out.println("Insufficient Balance!!!");
        } else {
            bankCustomer.Bank_AccountBalance -= amount;
            System.out.println("Withdrawal amount is: " +bankCustomer.Bank_AccountBalance);
        }
    }
    
    public void getStatement() {
        System.out.println(bankCustomer.toString());
    }

    public void TotalAccountNumber(){
        System.out.println("TOTAL NUMBER OF ACCOUNTS: " + BankCustomer.Bank_TotalAccountNumber);
    }
}