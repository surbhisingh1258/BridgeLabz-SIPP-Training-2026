import java.util.Scanner;

public class MetroFare{
    public static void main(String[] args){
        double balance=600.00;
        Scanner sc = new Scanner(System.in);

        while(balance>0){

            System.out.println("--------------------------------------------------------------");
            System.out.println("enter distance in km or type -1 to exit: ");
            double distance = sc.nextDouble();

            if(distance == -1){
                break;
            }

            System.out.println("your current balance is :"+balance);

            //fare calculation
            double fare=(distance<=5)?10:(distance<=10)?20:(distance<=20)?30:50;
            
            //balance calculation
            if(balance>=fare){
                balance=balance-fare;
                System.out.println("Available balance:"+balance);
            }else{
                System.out.println("Insufficient balance, Please check!");

            }
            System.out.println("THANK YOU!!");
            System.out.println("--------------------------------------------------------------");

        }
        System.out.println("card time exceeded or balance is zero!!");
    }
}