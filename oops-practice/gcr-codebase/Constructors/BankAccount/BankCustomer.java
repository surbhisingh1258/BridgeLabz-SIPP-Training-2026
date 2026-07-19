public class BankCustomer {
    int Bank_AccountNumber;
    String Bank_AccountHolder;
    double Bank_AccountBalance;
    static int Bank_TotalAccountNumber;

    public BankCustomer(int bank_AccountNumber, String bank_AccountHolder, double bank_AccountBalance) {
        Bank_AccountNumber = bank_AccountNumber;
        Bank_AccountHolder = bank_AccountHolder;
        Bank_AccountBalance = bank_AccountBalance;
    }

    @Override
    public String toString() {
        return "BankCustomer{" +
                "Bank_AccountNumber=" + Bank_AccountNumber +
                ", Bank_AccountHolder='" + Bank_AccountHolder + '\'' +
                ", Bank_AccountBalance=" + Bank_AccountBalance +
                '}';
    }
}