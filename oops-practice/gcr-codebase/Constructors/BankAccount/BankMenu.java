import java.util.Scanner;

public class BankMenu{
    public void bankDisplay(){
        BankUtility bankUtility = new BankUtility();
        
        while(true){
            System.out.println("------------------------------------------------");
            System.out.println("WELCOME TO SBI BANK");
            System.out.println("------------------------------------------------");
            System.out.println("1.CREATE ACCOUNT\n2.DEPOSITE\n3.WITHDRAWL\n4.GETSTATEMENT\n5.TOTAL ACCOUNT NUMBER \n6. EXIT");
            System.out.println("ENTER CHOICE: ");

            Scanner sc=new Scanner(System.in);
            int choice=sc.nextInt();

            if(choice==6){
                break;
            }
            switch(choice){
                case 1:
                    bankUtility.createAccount();
                    break;

                case 2:
                    System.out.println("ENTER AMOUNT TO DEPOSITE: ");
                    double amount=sc.nextDouble();
                    bankUtility.deposit(amount);
                    break;

                case 3:
                    System.out.println("ENTER AMOUNT TO WITHDRAW: ");
                    amount=sc.nextDouble();
                    bankUtility.withdraw(amount);
                    break;
                    

                case 4:
                    bankUtility.getStatement();
                    break;
                
                case 5:
                    bankUtility.TotalAccountNumber();
                    break;

                default:
                    System.out.println("Inavlid Choice");
                    break;
            }
        }

    }
}